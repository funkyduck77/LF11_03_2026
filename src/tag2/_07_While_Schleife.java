package tag2;

public class _07_While_Schleife {
    static void main() {

        // Was ist eine while-Schleife?
        // → Wiederholt den Codeblock, solange die Bedingung true ist.
        // → Kopfgesteuerte Schleife: Bedingung wird vor jedem Durchlauf geprüft

        int leben = 5;
        String richtigesWort = "HALLO";

        while (leben > 0) {
            IO.println("Du kannst noch spielen. Du hast noch " + leben + " Leben.");

            String eingabe = IO.readln("Bitte Wort raten: ");

            if (eingabe.equals(richtigesWort)) {
                IO.println("GEWONNEN!");
                break;
            } else {
                IO.println("Das wars leider nicht, versuch nochmal!");
                leben--;
            }
        }

        IO.println("Spiel beendet.");

    }
    // Hinweis:
    // - Bedingung wird **vor jedem Durchlauf geprüft**
    // - Ohne Erhöhung des Zählers würde die Schleife **unendlich laufen**
    // - Ideal, wenn die Anzahl der Durchläufe **nicht vorher bekannt** ist
}
