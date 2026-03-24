package tag2._02;

public class switchAnweisung {
    static void main() {
        int tag = Integer.parseInt(IO.readln("Bitte Wochentag eingeben (1-7): "));

        switch (tag){
            case 1:
                IO.println("Montag");
                break;
            case 2:
                IO.println("Dienstag");
                break;
            case 3:
                IO.println("Mittwoch");
                break;
            case 4:
                IO.println("Donnerstag");
                break;
            case 5:
                IO.println("Freitag");
                break;
            case 6:
                IO.println("Samstag");
                break;
            case 7:
                IO.println("Sonntag");
                break;
            default:
                IO.println("Wochentag ungültig");
                break;
        }
    }
}
