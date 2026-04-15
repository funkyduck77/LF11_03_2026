package tag7.loesungen.aufgabe5;

public class Gast extends User {
    private int tageGueltig;

    public Gast(String username, int tageGueltig) {
        super(username, 0);
        this.tageGueltig = tageGueltig;
    }

    // Methode mit Gültigkeit
    @Override
    public void ausgeben() {
        IO.println("Gast: " + getUsername() + " | Gültig für: " + tageGueltig + " Tage");
    }

}
