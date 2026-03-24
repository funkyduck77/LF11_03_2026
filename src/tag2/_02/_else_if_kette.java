package tag2._02;

public class _else_if_kette {
    static void main() {

        int note = 4;

        if(note == 1){
            IO.println("Sehr gut");
        } else if(note == 2){
            IO.println("Gut");
        } else if(note == 3){
            IO.println("Befriedigend");
        } else if(note == 4){
            IO.println("Ausreichend");
        } else if(note == 5){
            IO.println("Mangelhaft");
        } else {
            IO.println("Ungenügend");
        }
    }
}
