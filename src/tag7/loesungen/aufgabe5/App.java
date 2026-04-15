package tag7.loesungen.aufgabe5;

public class App {
    static void main() {
        User user1 = new User("max_power", 5);
        Moderator moderator = new Moderator("the_mod_123", 150, true);
        Gast gast = new Gast("super_gast321", 10);

        // Ausgabe der 3 Benutzer
        user1.ausgeben();
        moderator.ausgeben();
        gast.ausgeben();

    }
}
