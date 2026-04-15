package tag7.toString;

public class Schiff extends Fahrzeug {

    // Überschreiben
    @Override
    public void bewegen() {
        IO.println("Das Schiff fährt auf dem Wasser.");
    }
}
