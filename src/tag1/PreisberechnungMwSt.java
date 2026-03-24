package tag1;

public class PreisberechnungMwSt {
    static void main() {
        // ---------------------------------------------------------
        // Aufgabe 8: Preisberechnung mit Mehrwertsteuer
        // Lies ein:
        // - Nettopreis (double)
        // - Mehrwertsteuer in % (double)
        // Berechne den Bruttopreis:
        // Brutto = Netto * (1 + MwSt/100)
        // ---------------------------------------------------------

        double nettopreis = Double.parseDouble(IO.readln("Bitte Nettopreis eingeben: "));
        double mwst_proz = Double.parseDouble(IO.readln("Bitte MwSt in % eingeben: "));

        double buttopreis = nettopreis * ((mwst_proz/100) + 1);
        IO.println("Der Bruttopreis ist: " + buttopreis);
    }
}
