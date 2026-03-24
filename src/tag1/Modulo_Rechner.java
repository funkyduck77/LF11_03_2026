package tag1;

import javax.swing.*;

public class Modulo_Rechner {
    static void main() {
        // ---------------------------------------------------------
        // Aufgabe 6: Modulo-Rechner
        // Lies eine ganze Zahl ein und gib aus:
        // - ob sie gerade oder ungerade ist
        // - ob sie durch 3 teilbar ist
        // - ob sie durch 5 teilbar ist
        // Nutze dazu den Modulo-Operator (%).
        // ---------------------------------------------------------

        String jOptionZahl = JOptionPane.showInputDialog("Gib eine Zahl ein: ");
        double doubleZahl = Double.parseDouble(jOptionZahl);
        int zahl = (int) doubleZahl;
        if (zahl % 2 == 0) {
            IO.println("Die Zahl " + zahl + " ist gerade.");
        }
        if (zahl % 3 == 0) {
            IO.println("Die Zahl " + zahl + " ist durch 3 teilbar.");
        }
        if (zahl % 5 == 0) {
            IO.println("Die Zahl " + zahl + " ist durch 5 teilbar.");
        }

    }
}
