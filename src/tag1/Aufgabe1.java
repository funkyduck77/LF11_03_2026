package tag1;

import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        //
        Scanner benutzereingabe = new Scanner(System.in);

        // was soll das? Du hast noch keine Eingabe
//        double ersteZahl;
//        double zweiteZahl;
//
//        char operator;

        System.out.println("Geben Sie einen Zahlen ein: ");
//        ersteZahl = benutzereinage.nextDouble();   ??????
        double ersteZahl = benutzereingabe.nextDouble();
        // wir lesen die erste Zahl aus der Eingabe ein. Ich habe hier ein Double genommen

        System.out.println("Geben Sie einen Zweite Zahlen ein: ");
        double zweiteZahl = benutzereingabe.nextDouble();
        // wir lesen die zweite Zahl aus der Eingabe ein. Ich habe hier ein Double genommen

//        System.out.println("Eingabe?? oO");
//        operator = benutzereinage.next().charAt(0);
        System.out.println("Geben Sie einen Operator (+ - / *) ein: ");
        String operator = benutzereingabe.next(); // hier wird der Operator als String eingelesen
        /* Achtung, beim Einlesen mit nextLine() wird das „Enter-Zeichen“ (der Zeilenumbruch \n)
        der im Eingabepuffer des Systems nach dem einlesen von nextInt() oder nextDouble() liegen bleibt
        erkannt und hier verwurstet. das führt dazu, das die Eingabe übersprungen wird. Daher hier einlesen über
        next() oder Zwischenzeile mit "benutzereingabe.nextLine();" einfügen um das übrig gebliebene "Enter" zu clearen
         */

//        if (operator == '*') {
//            System.out.println(ersteZahl * zweiteZahl);
//        } else if (operator == '/') {
//            System.out.println(ersteZahl / zweiteZahl);
//        } else if (operator == '+') {
//            System.out.println(ersteZahl + zweiteZahl);
//        } else if (operator == '-') {
//            System.out.println(ersteZahl - zweiteZahl);
//        } else {
//            System.out.println("Ungültig");
//        }
          /* beim Abprüfen auf einen String kannst du so nicht über if (operator == '*') prüfen.
          Hier musst du über equals gehen, also if(operator.equals("*")) oder du löst das über switch, ist schicker ;).
           */
        double ergebnis = 0;
        switch (operator) {
            case "*":
                ergebnis = ersteZahl * zweiteZahl;
                break;
            case "/":
                ergebnis = ersteZahl / zweiteZahl;
                break;
            case "+":
                ergebnis = ersteZahl + zweiteZahl;
                break;
            case "-":
                ergebnis = ersteZahl - zweiteZahl;
                break;
            default:
                System.out.println("Unbekannter Operator");
                break;
        }
        System.out.println("Operator war " + operator + " und das Ergebnis ist " + ergebnis);


    }
}