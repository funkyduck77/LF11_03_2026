package tag7.loesungen.aufgabe7;

public class App {
    static void main() {

        // 1. Überprüfen, wie viele User es gibt
        IO.println("Aktuell gibt es " + User.getUserZaehler() + " Benutzer.");

        User user1 = new User("max_power", 5);
        Moderator moderator = new Moderator("the_mod_123", 150, true);
        Gast gast = new Gast("super_gast321", 10);

        // 2. Ausgabe der erstellten User - Erwartung: 3
        IO.println("Aktuell gibt es " + User.getUserZaehler() + " Benutzer.");
    }
}
