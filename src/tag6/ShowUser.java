package tag6;

public class ShowUser {

    static void main() {
        // Erstes Objekt erstellen (Konstruktor A)
        User user1 = new User("max_power", 5);

        // Methode aufrufen
        user1.ausgeben();

        // Zweites Objekt erstellen (Konstruktor B)
        User user2 = new User();

        // Methode aufrufen
        user2.ausgeben();

        // Objekt Moderator
        Moderator mod = new Moderator("Mod-Peter", 195, true);
        mod.setBeitragsAnzahl(200);
        mod.ausgeben();

        // Objekt Gast
        Gast gast = new Gast("Gast-Jens", 7);
        gast.ausgeben();
    }
}

