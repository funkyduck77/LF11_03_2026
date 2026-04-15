package tag7.loesungen.aufgabe7;

public class User {
    // statisches Attribut
    private static int userZaehler = 0;

    private String username;
    private int beitragsAnzahl;

    // Konstruktor A
    public User(String username, int beitragsAnzahl) {
        this.username = username;
        this.beitragsAnzahl = beitragsAnzahl;

        // Erhöung um 1, jedes Mal, wenn ein neues Objekt vom Typ User
        // (also auch Gast und Moderator) erstellt wird
        userZaehler++;
    }

    // Konstruktor B
    public User() {
        this.username = "Unbekannt";
        this.beitragsAnzahl = 0;

        // Erhöung um 1, jedes Mal, wenn ein neues Objekt vom Typ User
        // (also auch Gast und Moderator) erstellt wird
        userZaehler++;
    }

    // statische Methode zum Ausgeben der Anzahl der User (quasi ein Getter)
    public static int getUserZaehler() {
        return userZaehler;
    }

    @Override
    public String toString() {
        return "[User: " + username + " | Beiträge: " + beitragsAnzahl + "]";
    }

    // Getter & Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getBeitragsAnzahl() {
        return beitragsAnzahl;
    }

    // Validierung
    public void setBeitragsAnzahl(int beitragsAnzahl) {
        if (beitragsAnzahl < 0) {
            IO.println("Beiträge können nicht weniger als 0 sein. Der Wert wird nicht verändert.");
        } else {
            this.beitragsAnzahl = beitragsAnzahl;
        }
    }
}
