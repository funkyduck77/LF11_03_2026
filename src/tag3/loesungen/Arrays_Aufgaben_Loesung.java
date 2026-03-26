package tag3.loesungen;

import java.util.Arrays;
import java.util.Random;

public class Arrays_Aufgaben_Loesung {
    static void main(String[] args) {
        IO.println("Aufgabe 1: ");
        int[] zahlen = {10, 20, 30, 40, 50};

        // Erstes und letztes Element
        IO.println("Erstes Element: " + zahlen[0]);
        IO.println("Letztes Element: " + zahlen[zahlen.length - 1]);

        // Wert an Index 1 ändern
        zahlen[1] = 25;

        // Ausgabe mit for-Schleife
        System.out.print("Array Inhalt: ");
        for (int i = 0; i < zahlen.length; i++) {
            IO.print(zahlen[i] + " ");
        }


        IO.println("Aufgabe 2: ");

        int[] eingabeArray = new int[6];
        int summe = 0;

        // Befüllen durch Nutzereingabe
        for (int i = 0; i < eingabeArray.length; i++) {
            IO.println("Bitte Zahl eingeben: ");
            eingabeArray[i] = Integer.parseInt(IO.readln());
            summe += eingabeArray[i];
        }

        double durchschnitt = (double) summe / eingabeArray.length;

        IO.println("Werte: " + Arrays.toString(eingabeArray));
        IO.println("Summe: " + summe);
        IO.println("Durchschnitt: " + durchschnitt);

        IO.println();

        IO.println("Aufgabe 3: ");
        int[] zufallsZahlen = new int[10];
        Random random = new Random();

        for (int i = 0; i < zufallsZahlen.length; i++) {
            zufallsZahlen[i] = random.nextInt(100) + 1; // 1 bis 100
        }

        IO.println("Zufallsarray: " + Arrays.toString(zufallsZahlen));

        // Maximum und Minimum finden
        int max = zufallsZahlen[0];
        int min = zufallsZahlen[0];
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 1; i < zufallsZahlen.length; i++) {
            if (zufallsZahlen[i] > max) {
                max = zufallsZahlen[i];
                indexMax = i;
            }
            if (zufallsZahlen[i] < min) {
                min = zufallsZahlen[i];
                indexMin = i;
            }
        }

        IO.println("Maximum: " + max + " an Index " + indexMax);
        IO.println("Minimum: " + min + " an Index " + indexMin);

        // Zusatz: Sortieren und Prüfen
        Arrays.sort(zufallsZahlen);
        IO.println("Sortiertes Array: " + Arrays.toString(zufallsZahlen));

        if (min == zufallsZahlen[0] && max == zufallsZahlen[zufallsZahlen.length - 1]) {
            IO.println("Check erfolgreich: Min/Max stimmen mit Sortierung überein.");
        }
    }
}
