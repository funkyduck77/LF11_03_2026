package tag1;

import javax.swing.*;

public class BMIRechner {
    static void main() {
        // ---------------------------------------------------------
        // Aufgabe 3: BMI-Rechner
        // Lies ein:
        // - Gewicht (kg)
        // - Größe (m)
        // Berechne den BMI:
        // BMI = Gewicht / (Größe²)
        // ---------------------------------------------------------

        String jOptionGewicht = JOptionPane.showInputDialog("Gib das Gewicht ein: ");
        String jOptionGroesse = JOptionPane.showInputDialog("Gib die Größe in Meter mit . ein: ");

        double gewicht = Double.parseDouble(jOptionGewicht);
        double groesse = Double.parseDouble(jOptionGroesse);

        double bmiErgebnis = gewicht / (groesse * groesse);

        IO.println("Der BMI ist: " + bmiErgebnis);

    }
}
