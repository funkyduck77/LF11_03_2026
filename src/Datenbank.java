
import java.sql.*;
public class Datenbank {
    public static void main(String[] args) {
        // Diese 3 Zeilen sind auf dein Bild abgestimmt:
        String url = "jdbc:mysql://localhost:3306/deine_datenbank";
        String user = "root";
        String pass = ""; // <--- Hier dein MySQL-Passwort eintragen

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            System.out.println("Verbindung erfolgreich!");

            // Teil A: Neuen Nutzer hinzufügen (Max)
            String insertSql = "INSERT INTO nutzer (name, punkte) VALUES (?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(insertSql)) {
                pstmt.setString(1, "Max");
                pstmt.setInt(2, 85);
                pstmt.executeUpdate();
            }

            // Teil B: Alle Nutzer (auch deinen 'TestUser' aus dem Bild) anzeigen
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT name, punkte FROM nutzer")) {
                while (rs.next()) {
                    System.out.println("Name: " + rs.getString("name") +
                            " | Punkte: " + rs.getInt("punkte"));
                }
            }
        }

        catch (SQLException e) {
            System.err.println("Fehler: " + e.getMessage());
        }
    }
}