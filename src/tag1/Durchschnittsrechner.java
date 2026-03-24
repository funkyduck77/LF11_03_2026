package tag1;

import javax.swing.*;

public class Durchschnittsrechner {
    static void main() {

        // ---------------------------------------------------------
        // Aufgabe 7: Durchschnittsrechner
        // Benutzer gibt drei double-Werte ein.
        // Berechne den Durchschnitt.
        // Runde das Ergebnis auf zwei Nachkommastellen.
        // ---------------------------------------------------------
        String jOptionZahl_1 = JOptionPane.showInputDialog("Gib eine Zahl 1 ein: ");
        double doubleZahl_1 = Double.parseDouble(jOptionZahl_1);

        String jOptionZahl_2 = JOptionPane.showInputDialog("Gib eine Zahl 2 ein: ");
        double doubleZahl_2 = Double.parseDouble(jOptionZahl_2);

        String jOptionZahl_3 = JOptionPane.showInputDialog("Gib eine Zahl 3 ein: ");
        double doubleZahl_3 = Double.parseDouble(jOptionZahl_3);

        double summe = doubleZahl_1 + doubleZahl_2 + doubleZahl_3;
        double durchschnitt = summe / 3;
        double rundung_durchschnitt = Math.round(durchschnitt *100.0)/100.0;

        IO.println("Der Druchschnitt der Zahlen ist: " + String.format("%.2f", rundung_durchschnitt));
    }
}
