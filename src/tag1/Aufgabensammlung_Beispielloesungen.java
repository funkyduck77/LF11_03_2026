package tag1;

public class Aufgabensammlung_Beispielloesungen {

    public static void main(String[] args) {

        // ---------------------------------------------------------
        // Aufgabe 1: Einfacher Taschenrechner
        // Schreibe ein Programm, das:
        // - zwei ganze Zahlen vom Benutzer einliest
        // - Addition, Subtraktion, Multiplikation und Division berechnet
        // - die Ergebnisse ausgibt
        // ---------------------------------------------------------

        int zahl1 = Integer.parseInt(IO.readln("Zahl 1 eingeben: "));
        int zahl2 = Integer.parseInt(IO.readln("Zahl 2 eingeben: "));

        IO.println("Addition: " + (zahl1 + zahl2));
        IO.println("Subtraktion: " + (zahl1 - zahl2));
        IO.println("Multiplikation: " + (zahl1 * zahl2));
        IO.println("Division: " + (zahl1 / zahl2));


        // ---------------------------------------------------------
        // Aufgabe 2: Temperaturrechner
        // Lies eine Temperatur in Celsius ein und wandle sie
        // in Fahrenheit um.
        // Formel: F = C * 1.8 + 32
        // ---------------------------------------------------------

        double celsius = Double.parseDouble(IO.readln("Temperatur eingeben in Celsius: "));
        double fahrenheit = celsius * 1.8 + 32;
        IO.println("Temperatur in Fahrenheit: " + fahrenheit);

        // ---------------------------------------------------------
        // Aufgabe 3: BMI-Rechner
        // Lies ein:
        // - Gewicht (kg)
        // - Größe (m)
        // Berechne den BMI:
        // BMI = Gewicht / (Größe²)
        // ---------------------------------------------------------

        double gewicht = Double.parseDouble(IO.readln("Gewicht (kg): "));
        double groesse = Double.parseDouble(IO.readln("Größe (im m): "));
        double bmi = gewicht / (groesse * groesse);

        IO.println("BMI: " + bmi);


        // ---------------------------------------------------------
        // Aufgabe 4: Minuten in Stunden und Minuten umrechnen
        // Der Benutzer gibt eine Anzahl Minuten ein.
        // Rechne sie um in:
        // - volle Stunden
        // - verbleibende Minuten
        // Beispiel: 135 → 2 Stunden und 15 Minuten
        // ---------------------------------------------------------

        int minuten = Integer.parseInt(IO.readln("Minuten eingeben: "));

        int stunden = minuten / 60;
        int restMinuten = minuten % 60;

        IO.println(minuten + " sind: " + stunden + " Stunden und " + restMinuten + " Minuten");


        // ---------------------------------------------------------
        // Aufgabe 5: String + Zahl
        // Lies einen Namen und ein Alter ein.
        // Gib aus:
        // "Hallo <Name>, in 10 Jahren bist du <Alter+10>!"
        // ---------------------------------------------------------

        String name = IO.readln("Namen eingeben: ");
        int alter = Integer.parseInt(IO.readln("Alter eingeben: "));

        IO.println("Hallo " + name + ", in 10 Jahren bist du " + (alter + 10 ) + "!");


        // ---------------------------------------------------------
        // Aufgabe 6: Modulo-Rechner
        // Lies eine ganze Zahl ein und gib aus:
        // - ob sie gerade oder ungerade ist
        // - ob sie durch 3 teilbar ist
        // - ob sie durch 5 teilbar ist
        // Nutze dazu den Modulo-Operator (%).
        // ---------------------------------------------------------

        int zahl = Integer.parseInt(IO.readln("Zahl eingeben: "));

        IO.println("Gerade: " + (zahl % 2 == 0));
        IO.println("Durch 3: " + (zahl % 3 == 0));
        IO.println("Durch 5: " + (zahl % 5 == 0));


        // ---------------------------------------------------------
        // Aufgabe 7: Durchschnittsrechner
        // Benutzer gibt drei double-Werte ein.
        // Berechne den Durchschnitt.
        // Runde das Ergebnis auf zwei Nachkommastellen.
        // ---------------------------------------------------------

        double double1 = Double.parseDouble(IO.readln("double 1 eingeben: "));
        double double2 = Double.parseDouble(IO.readln("double 2 eingeben: "));
        double double3 = Double.parseDouble(IO.readln("double 3 eingeben: "));

        double summe = double1 + double2 + double3;
        double durchschnitt = summe / 3;

        IO.println(String.format("Der Durchschnitt beträgt: %.2f", durchschnitt));


        // ---------------------------------------------------------
        // Aufgabe 8: Preisberechnung mit Mehrwertsteuer
        // Lies ein:
        // - Nettopreis (double)
        // - Mehrwertsteuer in % (double)
        // Berechne den Bruttopreis:
        // Brutto = Netto * (1 + MwSt/100)
        // ---------------------------------------------------------

        double netto = Double.parseDouble(IO.readln("Nettopreis: "));
        double mwSt = Double.parseDouble(IO.readln("Mehrwertsteuer in %: "));

        double brutto = netto * (1 + mwSt/100);
        IO.println("Brutto: " + brutto);


        // ---------------------------------------------------------
        // Aufgabe 9: Sekundenrechner
        // Benutzer gibt eine Anzahl Sekunden ein.
        // Rechne sie um in:
        // - Stunden
        // - Minuten
        // - Sekunden
        // Beispiel: 3665 → 1 h, 1 min, 5 sec
        // ---------------------------------------------------------

        int sekundenGesamt = Integer.parseInt(IO.readln("Sekunden: "));
        int h = sekundenGesamt / 3600;
        int m = (sekundenGesamt % 3600) / 60;
        int s = sekundenGesamt % 60;
        IO.println(h + "h " + m + "min " + s + "sec");
    }
}
