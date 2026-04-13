package tag6;

public class Gast extends User {
    int tageGueltig;

    // Konstruktor Gast
    public Gast(String username, int tageGueltig) {
        super(username);
        this.tageGueltig = tageGueltig;
    }
    public void ausgeben() {
        super.ausgeben();
        System.out.print(" Gastkonto : " + this.tageGueltig + " Tage gültig.");
    }
    ;

}
