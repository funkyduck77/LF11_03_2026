package tag6;

import javax.lang.model.element.NestingKind;

public class User {
    private String username;
    private int beitragsAnzahl;

    public String getUsername () {
        return username;
    }
    public int getBeitragsAnzahl () {
        return beitragsAnzahl;
    }
    public void setUsername (String neuerUsername) {
        this.username = neuerUsername;
    }
    public void setBeitragsAnzahl (int neueBeitragsAnzahl) {
        this.beitragsAnzahl = neueBeitragsAnzahl;
    }

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
