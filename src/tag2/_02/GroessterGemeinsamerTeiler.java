package tag2._02;

public class GroessterGemeinsamerTeiler {
    static void main() {
        int mZahl = Integer.parseInt(IO.readln("Gib die erste Zahl ein: "));
        int nZahl = Integer.parseInt(IO.readln("Gib die zweite Zahl ein: "));

        int rRest = mZahl % nZahl;

        //IO.println("Rest" + rRest);

        while(rRest > 0){
            mZahl = nZahl;
            nZahl = rRest;
            rRest = mZahl % nZahl;
        }
        IO.println("Rest" + nZahl);
    }
}
