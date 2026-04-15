package tag7.loesungen.aufgabe6;

public class Gast extends User {
    private int tageGueltig;

    public Gast(String username, int tageGueltig) {
        super(username, 0);
        this.tageGueltig = tageGueltig;
    }

    // Überschriebene toString
    @Override
    public String toString() {
        return "[Gast: " + getUsername() + " | Tage gültig: " + tageGueltig + "]";
    }
}
