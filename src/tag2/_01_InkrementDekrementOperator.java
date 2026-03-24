package tag2;

public class _01_InkrementDekrementOperator {

    static void main() {

        int leben = 10;

        // Post-Inkrement: zuerst ausgeben, dann erhöhen
        IO.println("Leben  mit POST-Inkrement: " +  leben++);
        IO.println("Leben jetzt: " + leben);

        // Prä-Inkrement: zuerst erhöhen, dann ausgeben
        IO.println("Leben  mit PRÄ-Inkrement: " +  ++leben);
        IO.println("Leben jetzt: " + leben);


        // Post-Dekrement: zuerst ausgeben, dann verringern
        IO.println("Leben  mit POST-Dekrement: " +  leben--);
        IO.println("Leben jetzt: " + leben);

        // Prä-Dekrement: zuerst verringern, dann ausgeben
        IO.println("Leben  mit PRÄ-Dekrement: " +  --leben);
        IO.println("Leben jetzt: " + leben);

    }
}
