package tag5.main;

public class Taschenrechner {

    public int addiere(int zahl1, int zahl2) {
        return zahl1 + zahl2;
    }

    public int dividiere(int zahl1, int zahl2) {
        if (zahl2 == 0) {
            throw new IllegalArgumentException("Division durch 0 ist nicht erlaubt.");
        }
        return zahl1 / zahl2;
    }
}
