package tag6;

public class Moderator extends User {
    boolean superModerator;

    //Konstruktor Moderator
    public Moderator (String username, int beitrags, boolean superModerator) {
        super(username,beitragsAnzahl);
        this.superModerator = superModerator;
    }
}
