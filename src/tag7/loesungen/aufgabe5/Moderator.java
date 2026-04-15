package tag7.loesungen.aufgabe5;

public class Moderator extends User {
    private boolean istSuperModerator;

    // Konstruktor, der alle Attribute (auch die geerbten) entgegennimmt und per super() an den Elternkonstruktor gibt
    public Moderator(String username, int beitragsAnzahl, boolean istSuperModerator) {
        super(username, beitragsAnzahl);
        this.istSuperModerator = istSuperModerator;
    }

    // Methode mit Super-Moderator
    @Override
    public void ausgeben() {
        IO.println("Moderator: " + getUsername() + " (Beiträge: " + getBeitragsAnzahl() + ") | STATUS: Super-Moderator: " + istSuperModerator);
    }
}
