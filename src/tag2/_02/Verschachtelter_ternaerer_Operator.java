package tag2._02;

public class Verschachtelter_ternaerer_Operator {
    static void main() {
        int temperatur = -1;

        String beschreibung = (temperatur > 20) ? "Warm" : (temperatur > 0 && temperatur <= 20) ? "Kühl" : "Eiskalt";
        IO.println("Beschreibung: " + beschreibung);
    }
}
