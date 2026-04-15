package tag8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// http://localhost:84/phpmyadmin oder GUI der Wahl
public class _01_DBConnection {
     static void main(String[] args) throws ClassNotFoundException {

        String dbUrl = "jdbc:mysql://localhost:3306/testdb"; // case insensitive! Datenbank muss vorher angelegt sein!
        String user = "root";
        String password = "";

        try {
            // Verbindung herstellen
            Connection connection = DriverManager.getConnection(dbUrl, user, password);
            System.out.println("Verbindung erfolgreich!");

            // Verbindung wieder schließen
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Fehler beim Verbindungsaufbau.");
        }
    }

}
