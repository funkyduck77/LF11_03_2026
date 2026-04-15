package tag8;

import java.sql.*;

// Hier wird gezeigt, wie man eine Transaktion ausführen kann, wenn autocommit deaktiviert wird
public class _04_Transaction_Demo {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Verbindung erfolgreich hergestellt!");

            // Auto-Commit deaktivieren -> wir wollen die Transaktion kontrollieren
            connection.setAutoCommit(false);

            // 1) INSERT: neuen User einfügen
            insertUser(connection, "Anna");

            // 1.1) INSERT: neuen User einfügen -> Abbruch, weil doppelter Name
            //  insertUser(connection, "Raphaela");

            // 2) SELECT: alle User anzeigen
            selectUsers(connection);

            // 3) DELETE: wieder löschen
            deleteUser(connection, "Anna");

            // 4) SELECT: nochmal anzeigen
            selectUsers(connection);

            // Alles bestätigen → COMMIT
            connection.commit();
            System.out.println("Transaktion erfolgreich abgeschlossen!");

        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if (connection != null) {
                    // Im Fehlerfall alles zurückrollen → ROLLBACK
                    connection.rollback();
                    System.out.println("Transaktion zurückgerollt!");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Verbindung geschlossen!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void insertUser(Connection connection, String name) throws SQLException {
        String sql = "INSERT INTO users (name) VALUES (?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();
            System.out.println("User '" + name + "' eingefügt!");
        }
    }

    private static void selectUsers(Connection connection) throws SQLException {
        String sql = "SELECT id, name FROM users";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("\nAktuelle User:");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }
        }
    }

    private static void deleteUser(Connection connection, String name) throws SQLException {
        String sql = "DELETE FROM users WHERE name = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, name);
            int rows = preparedStatement.executeUpdate();
            System.out.println(rows + " User '" + name + "' gelöscht!");
        }
    }
}
