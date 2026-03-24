package tag1;

import javax.swing.*;

public class Taschenrechner {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // Aufgabe 1: Einfacher Taschenrechner
        // Schreibe ein Programm, das:
        // - zwei ganze Zahlen vom Benutzer einliest
        // - Addition, Subtraktion, Multiplikation und Division berechnet
        // - die Ergebnisse ausgibt
        // ---------------------------------------------------------
        String jOptionZahl1 = JOptionPane.showInputDialog("Gib die Zahl1 ein: ");
        String jOptionZahl2 = JOptionPane.showInputDialog("Gib die Zahl2 ein: ");

        int zahl1 = Integer.parseInt(jOptionZahl1);
        int zahl2 = Integer.parseInt(jOptionZahl2);

        //int additionErg = zahl1 + zahl2;
        IO.println("Zahl1 + Zahl2 = " + (zahl1 + zahl2));
        IO.println("Zahl1 - Zahl2 = " + (zahl1 - zahl2));
        IO.println("Zahl1 * Zahl2 = " + (zahl1 * zahl2));
        IO.println("Zahl1 / Zahl2 = " + (zahl1 / zahl2));


    }
}
