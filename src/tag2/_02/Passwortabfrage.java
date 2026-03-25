package tag2._02;

import javax.swing.*;

public class Passwortabfrage {
    static void main() {

        String korrektesPasswort = "geheim123";
        int versuche = 3;
        boolean zugriffGewaehrt = false;

        // Die Schleife läuft, solange noch Versuche übrig sind und der Zugriff nicht gewährt wurde
        while (versuche > 0 && !zugriffGewaehrt) {

            String eingabe = JOptionPane.showInputDialog("Gib das Passwort ein (Versuche übrig: " + versuche + "):");

            // Wichtig: Strings immer mit .equals() vergleichen!
            if (korrektesPasswort.equals(eingabe)) {
                System.out.println("Zugriff gewährt.");
                zugriffGewaehrt = true; // Bricht die Schleife beim nächsten Prüfen ab
            } else {
                versuche--; // Einen Versuch abziehen

                if (versuche > 0) {
                    System.out.println("Falsches Passwort. Noch " + versuche + " Versuche.");
                } else {
                    System.out.println("Zugriff verweigert.");
                }
            }
        }
    }

}
