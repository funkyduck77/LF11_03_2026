package tag6.loesungen.aufgabe1;

public class Main {
    static void main() {
        // Erstes Objekt erstellen
        User user1 = new User();

        // Werte manuell zuweisen (da noch kein Konstruktor vorhanden ist)
        user1.username = "max_power";
        user1.beitragsAnzahl = 5;

        // Methode aufrufen
        user1.ausgeben();

        // Zweites Objekt erstellen
        User user2 = new User();

        user2.username = "informatik_fan";
        user2.beitragsAnzahl = 42;

        // Methode aufrufen
        user2.ausgeben();
    }
}
