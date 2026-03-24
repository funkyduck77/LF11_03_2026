package tag1;

import javax.swing.*;

public class String_Zahl {
    static void main() {
        // ---------------------------------------------------------
        // Aufgabe 5: String + Zahl
        // Lies einen Namen und ein Alter ein.
        // Gib aus:
        // "Hallo <Name>, in 10 Jahren bist du <Alter+10>!"
        // ---------------------------------------------------------

        String jOptionName = JOptionPane.showInputDialog("Gib deinen Namen ein: ");
        String jOptionAlter = JOptionPane.showInputDialog("Gib dein Alter ein: ");

        double alter = Double.parseDouble(jOptionAlter);
        int alter10 = (int) alter + 10;

        IO.println("Hallo " + jOptionName + ", in 10 Jahren bist du " + alter10 + ".");
    }
}
