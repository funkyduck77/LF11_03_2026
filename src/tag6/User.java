package tag6;

public class User {
    String username;
    int beitragsAnzahl;

    //Konstruktor A
    public User(String username, int beitragsAnzahl) {
        this.username = username;
        this.beitragsAnzahl = beitragsAnzahl;
    }

    //Konstruktor B
    public User() {
        this.username = "unbekannter User";
        this.beitragsAnzahl = 0;
    }

    //Konstruktor C
    public User(String username) {
        this.username = username;
        this.beitragsAnzahl = 0;
    }

    public void ausgeben() {
        System.out.print("\n Benutzer: " + this.username + " Beiträge: " + this.beitragsAnzahl);

    }

}
