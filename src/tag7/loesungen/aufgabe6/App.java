package tag7.loesungen.aufgabe6;

public class App {
    static void main() {
        User user1 = new User("max_power", 5);
        Moderator moderator = new Moderator("the_mod_123", 150, true);
        Gast gast = new Gast("super_gast321", 10);

        // Test 1: Aufruf ohne extra Methodenaufruf:
        IO.println(user1);

        // Test 2: Automatische Verkettung mit anderen Strings
        IO.println("Aktueller Login: " + moderator);
    }
}
