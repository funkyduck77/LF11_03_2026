package tag2;

public class _08_Do_While_Schleife {
    static void main() {

        // Erklärung:
        // Eine do-while-Schleife führt den Codeblock **mindestens einmal** aus,
        // bevor die Bedingung überprüft wird → fußgesteuerte Schleife.
        // Syntax:
        // do {
        //     // Anweisungen
        // } while (Bedingung);

        int zaehler = 0;

        do {
            // Logik
            IO.println("Der Zähler ist bei: " + zaehler);
            zaehler++;
        } while (zaehler < 0);
    }
}
