package tag7.loesungen.aufgabe7;

public class Moderator extends User {
    private boolean istSuperModerator;

    // Konstruktor, der alle Attribute (auch die geerbten) entgegennimmt und per super() an den Elternkonstruktor gibt
    public Moderator(String username, int beitragsAnzahl, boolean istSuperModerator) {
        super(username, beitragsAnzahl);
        this.istSuperModerator = istSuperModerator;
    }

    @Override
    public String toString() {
        return "[Moderator: " + getUsername() + " | Beiträge: " + getBeitragsAnzahl() + " | Supermod: " + (istSuperModerator ? "ja" : "nein") + "]";
    }
}
