package tag2;

public class _02_ShortCircuitEvaluation {
    void main(String[] args) {

        boolean istEingeloggt = false;

        // Test mit & (Vollständige Auswertung)
        IO.println("Auswertung mit &:");
        boolean kannWasKaufen = istEingeloggt & pruefeGuthaben();

        // Test mit SCE
        IO.println("Auswertung mit &&:");
        boolean kannWasKaufen2 = istEingeloggt && pruefeGuthaben();
    }

    static boolean pruefeGuthaben() {
        IO.println("Greift auf DB zu.");
        return true;
    }

}
