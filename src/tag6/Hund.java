package tag6;

public class Hund {
    // Attribute (Eigenschaften)
    String name;
    int alter;

    // Methoden - was ein Objekt vom Typ Hund an Funktionalität haben muss
    public void bellen(){
        IO.println(name + " macht Wuff!");
    }

    // statische Methode -> kommt später!
    public static void statischeMethode() {
        IO.println("Ich bin statisch!");
    }
}
