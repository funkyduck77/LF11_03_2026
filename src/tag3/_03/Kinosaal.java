package tag3._03;

import java.util.Arrays;

public class Kinosaal {
    static void main() {

//        Stell dir vor, du verwaltet einen kleinen Kinosaal mit 3 Reihen und 4 Sitzen pro Reihe.
//
//        1. Initialisierung: Erstelle ein 2D-Integer-Array namens kino, das 3 Zeilen und 4 Spalten hat.
//        2. Belegung: Fülle das Array so, dass alle Sitze zuerst den Wert 0 (frei) haben. Belege dann manuell folgende Sitze
//        mit einer 1 (besetzt): (Hinweis: Achte auf die Null-Indizierung!)
//
//        Reihe 1, Sitz 2
//        Reihe 2, Sitz 4
//        Reihe 3, Sitz 1
//
//        (Hinweis: Achte auf die Null-Indizierung!)
//
//        3. Ausgabe: Gib den gesamten Sitzplan als Tabelle auf der Konsole aus. Nutze dafür zwei verschachtelte for-
//                Schleifen.
//        4. Zusatz: Gib am Ende aus, wie viele Sitze insgesamt im Kino vorhanden sind (nutze kino.length und kino[0].length).

        // Var initialisieren
        int kino[][] = new int[3][4];

        // Array nullen
        for (int i = 0; i < kino.length; i++) {
            // Setzt jeden Wert auf null
            Arrays.fill(kino[i], 0);
        }

        //Leeres Kino darstellen
        for (int[] ints : kino) {
            IO.print("[ ");
            for (int wert : ints) {
                IO.print(wert + " ");
            }
            IO.print("]");
            IO.println();
        }
        IO.println(); //Leerzeile

        kino[0][1] = 1;
        kino[1][3] = 1;
        kino[2][0] = 1;

        //teilbelegtes Kino darstellen
        for (int[] ints : kino) {
            IO.print("[ ");
            for (int wert : ints) {
                IO.print(wert + " ");
            }
            IO.print("]");
            IO.println();
        }
        IO.println(); //Leerzeile

        // Gesamtplätze im Kino
        int gesamtplaetze = kino.length * kino[0].length;

        // Belegte Plätze zählen
        int belegtePlaetze = 0;
        for (int[] reihe : kino) {
            for (int sitze : reihe) {
                if (sitze == 1) {
                    belegtePlaetze++;
                }
            }
        }

        //Ausgabe Plätze und Belegung
        IO.println("Gesamtplätze im Kino: " + gesamtplaetze + " davon belegt " + belegtePlaetze);
    }
}
