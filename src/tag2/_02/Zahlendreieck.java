package tag2._02;

public class Zahlendreieck {
    static void main() {
        int zahl = 10
                ;

        for (int i = 0; i <= zahl; i++ ){
            //IO.println();
            for (int j = 0; j <= i; j++){
                IO.print(j);
            }
            IO.println();
        }
    }
}
