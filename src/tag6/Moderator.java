package tag6;

public class Moderator extends User {
    boolean superModerator;

    //Konstruktor Moderator
    public Moderator (String username, int beitragsAnzahl, boolean superModerator) {
        super(username,beitragsAnzahl);
        this.superModerator = superModerator;
    }
    public void ausgeben() {
        super.ausgeben();
        System.out.print(" Mod: " + this.superModerator);
    }
}
