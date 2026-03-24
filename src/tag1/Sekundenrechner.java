package tag1;

public class Sekundenrechner {
    static void main() {
        // ---------------------------------------------------------
        // Aufgabe 9: Sekundenrechner
        // Benutzer gibt eine Anzahl Sekunden ein.
        // Rechne sie um in:
        // - Stunden
        // - Minuten
        // - Sekunden
        // Beispiel: 3665 → 1 h, 1 min, 5 sec
        // ---------------------------------------------------------

        int sekundenEingabe = Integer.parseInt(IO.readln("Bitte Sekunden eingeben: "));

        int stunden     = sekundenEingabe / 3600;

        int minuten     = (sekundenEingabe % 3600)/60;

        int sekunden    = sekundenEingabe % 60;

        IO.println(sekundenEingabe + " Sekunden sind: " + stunden + " Std, " + minuten + " Min, " + sekunden + " Sek. ");


    }
}
