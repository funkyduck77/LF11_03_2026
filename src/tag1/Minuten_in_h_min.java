package tag1;

import javax.swing.*;

public class Minuten_in_h_min {
    static void main() {
        // ---------------------------------------------------------
        // Aufgabe 4: Minuten in Stunden und Minuten umrechnen
        // Der Benutzer gibt eine Anzahl Minuten ein.
        // Rechne sie um in:
        // - volle Stunden
        // - verbleibende Minuten
        // Beispiel: 135 → 2 Stunden und 15 Minuten
        // ---------------------------------------------------------

        String jOptionMinuten = JOptionPane.showInputDialog("Gib die Minuten: ");
        double minutenDouble = Double.parseDouble(jOptionMinuten);

        int stunden = (int) minutenDouble / 60;
        int minuten = (int) minutenDouble % 60;


        IO.println("Sind " + stunden +  " Stunden und " + minuten + " Minute/n.");
    }

}
