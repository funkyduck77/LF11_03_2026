package tag3._03;

import javax.swing.*;
import java.util.Arrays;

public class MittelwerteUndBerechnungen {
    static void main() {

        int benoetigteWerte = 6;

        int zahlen[];
        zahlen = new int[6];

        while (benoetigteWerte > 0){
            String zahlenjOption = JOptionPane.showInputDialog("Gib eine Zahl ein [noch benötigte Werte: " + benoetigteWerte + " ]: ");
            int zahlFuerArray = Integer.parseInt(zahlenjOption);
            --benoetigteWerte;

            //Array füllen
            zahlen[benoetigteWerte] = zahlFuerArray;
        }

        //Summe berechnen
        int summe = 0;
        for (int i = 0; i < zahlen.length; i++) {
            summe += zahlen[i];
        }

        // Durchschnitt berechnen
        double durchschnitt = (double) summe / zahlen.length;

        // Array ausgeben
        IO.println("Arraywerte: " + Arrays.toString(zahlen));

        // Summe ausgeben
        IO.println("Summe: " + summe);

        // Durchschnitt ausgeben
        IO.println("Durchschnitt (Summe " + summe + " / Anzahl der Werte " + zahlen.length +  " ): " + durchschnitt);
    }
}
