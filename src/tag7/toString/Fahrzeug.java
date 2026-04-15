package tag7.toString;

public class Fahrzeug {

    private int baujahr;

    public void bewegen() {
        IO.println("Das Fahrzeug bewegt sich.");
    }

    // Shortcut für das Generieren von "Standard-Code" - alt + einfg
    @Override
    public String toString() {
        return "Baujahr: " + baujahr;
    }

    // Getter & Setter
    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }
}
