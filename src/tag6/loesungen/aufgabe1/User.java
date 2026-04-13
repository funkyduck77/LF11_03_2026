package tag6.loesungen.aufgabe1;

public class User {
    String username;
    int beitragsAnzahl;

    public void ausgeben() {
        IO.println("Benutzer: " + username + " (Beiträge: " + beitragsAnzahl + ")");
    }
}