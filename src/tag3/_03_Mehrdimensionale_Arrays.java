package tag3;

import java.util.Arrays;

public class _03_Mehrdimensionale_Arrays {
    static void main() {

        //  Initialisierung mit Größe: 3 Zeilen, 4 Spalten, Werte sind automatisch 0
        int[][] array2D = new int[5][6];

        array2D[0][0] = 5;
        array2D[2][3] = 3;

        IO.println(Arrays.deepToString(array2D));

        // Ausgabe for-Schleife
        for (int[] ints : array2D) {
            for (int wert : ints) {
                IO.print(wert + " ");
            }
            IO.println();
        }

        // mit for-i Schleife ausgeben
        for (int zeilen = 0; zeilen < array2D.length; zeilen++) {

            for (int spalten = 0; spalten < array2D[zeilen].length; spalten++) {
                IO.print(array2D[zeilen][spalten] + " ");

            }
            IO.println();
        }
    }
}
