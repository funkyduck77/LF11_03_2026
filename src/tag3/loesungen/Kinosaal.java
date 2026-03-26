package tag3.loesungen;

public class Kinosaal {
    static void main() {

        // 1. Deklaration und Initialisierung (3 Reihen, 4 Sitze)
        int[][] kino = new int[3][4];

        // 2. Sitze belegen (Beispiele)
        kino[0][1] = 1; // Reihe 1, Sitz 2
        kino[1][3] = 1; // Reihe 2, Sitz 4
        kino[2][0] = 1; // Reihe 3, Sitz 1

        // 3. Ausgabe als Tabelle
        IO.println("Kino-Sitzplan (0 = frei, 1 = besetzt):");
        for (int i = 0; i < kino.length; i++) { // Geht durch die Reihen
            for (int j = 0; j < kino[i].length; j++) { // Geht durch die Sitze
                IO.print(kino[i][j] + " ");
            }
            IO.println(); // Zeilenumbruch nach jeder Reihe
        }
    }
}
