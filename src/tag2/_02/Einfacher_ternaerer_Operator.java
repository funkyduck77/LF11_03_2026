package tag2._02;

public class Einfacher_ternaerer_Operator {
    static void main() {
        int zahl = 6;
        String paritaet = (zahl % 2 == 0) ? "Gerade" : "Ungerade";
        IO.println(paritaet);

    }
}
