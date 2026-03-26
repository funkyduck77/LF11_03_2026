package tag3._03;

public class ArrayGrundlagenZugriff {
    static void main() {
        int[] zahlen;

        zahlen = new int[5];

        zahlen[0] = 10;
        zahlen[1] = 20;
        zahlen[2] = 30;
        zahlen[3] = 40;
        zahlen[4] = 50;

        zahlen[1] = 25;

        for (int i = 0; i < zahlen.length; i++) {

            IO.println(zahlen[i]);

        }
    }
}
