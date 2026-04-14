package tag7.static_keyword;

public class Fahrzeug {

    private static int anzahlFahrzeuge;
    private int baujahr;

    public Fahrzeug(int baujahr) {
        this.baujahr = baujahr;
        // jedes Mal, wenn der Konstruktor aufgerufen wird, erhöht sich die Anzahl um 1
        anzahlFahrzeuge++;
    }

    public void bewegen() {
        IO.println("Das Fahrzeug bewegt sich.");
    }

    // Shortcut für das Generieren von "Standard-Code" - alt + einfg
    @Override
    public String toString() {
        return "Baujahr: " + baujahr;
    }

    public static int getAnzahlFahrzeuge() {
        return anzahlFahrzeuge;
    }
}
