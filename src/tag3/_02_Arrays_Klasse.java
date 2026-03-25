package tag3;

import java.util.Arrays;

public class _02_Arrays_Klasse {
    static void main() {

        // 1. Array erstellen
        int[] zahlen = {6, 5, 9, 8, 3};

        // 2. Arrays.fill() – alle Werte auf einen festen Wert setzen
        //Arrays.fill(zahlen, 0);

        // Array ausgeben mit toString()-Methode
        IO.println(Arrays.toString(zahlen));

        // 3. Arrays.sort() – sortieren
        Arrays.sort(zahlen);
        IO.println(Arrays.toString(zahlen));

        // 4. Arrays.equals() – Vergleich zweier Arrays
        int[] zahlen2 = {3,4,6,8,9};

        boolean istGleich = Arrays.equals(zahlen, zahlen2);
        IO.println("Ist gleich? " + istGleich);

        // 5. Arrays.mismatch() – erstes unterschiedliches Element finden
        int unterschied = Arrays.mismatch(zahlen, zahlen2);
        IO.println("Unterschied an Index: " + unterschied);

        // 6. Arrays.copyOf() - Kopie erstellen
        // bei primitiven Datentypen ändert sich das "Original" nicht, wenn der "Neue" verändert wird
        int zahl1 = 5;
        IO.println("Zahl1 " + zahl1);
        int zahl2 = zahl1;
        IO.println("Zahl2 basiert auf zahl1: " + zahl2);
        zahl2 = 7;
        IO.println("Neue Zahl2 " + zahl2);
        IO.println("Zahl1 " + zahl1);

        // Bei Arrays:
        String[] namen = {"Anna", "Tim"};
        IO.println("Namen" + Arrays.toString(namen));
        String[] besteFreunde = namen; // es wird nur eine neue Referenz auf das bereits bestehende Objekt {"Anna", "Tim"} gesetzt
        IO.println("Besties" + Arrays.toString(besteFreunde));

        besteFreunde[0] = "Jessi";
        IO.println("Besties" + Arrays.toString(besteFreunde));
        IO.println("Namen" + Arrays.toString(namen));

        String[] wirklicheKopie = Arrays.copyOf(namen, namen.length);
        IO.println("Kopie" + Arrays.toString(wirklicheKopie));

        wirklicheKopie[0] = "Elisa";
        IO.println("Kopie" + Arrays.toString(wirklicheKopie));
        IO.println("Namen" + Arrays.toString(namen));

    }
}
