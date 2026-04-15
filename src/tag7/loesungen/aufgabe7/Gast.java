package tag7.loesungen.aufgabe7;

public class Gast extends User {
    private int tageGueltig;

    public Gast(String username, int tageGueltig) {
        super(username, 0);
        this.tageGueltig = tageGueltig;
    }

    @Override
    public String toString() {
        return "[Gast: " + getUsername() + " | Tage gültig: " + tageGueltig + "]";
    }

}
