package tag6;

public class User {
    String username;
    int beitragsAnzahl;

    //Konstruktor A
    public User(String username, int beitragsAnzahl) {
        this.username = username;
        this.beitragsAnzahl = beitragsAnzahl;
    }
    //Konstruktor A
    public User() {
        this.username = "unbekannter User";
        this.beitragsAnzahl = 0;
    }

    public void ausgeben() {
        System.out.println("Benutzer: " + this.username + " Beiträge: " + this.beitragsAnzahl);
    }
}
