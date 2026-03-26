package tag4;

import java.util.ArrayList;

public class _01_ArrayList_Demo {
    static void main() {

        // Erzeugung einer ArrayList
        ArrayList<String> artikelListe = new ArrayList<>();

        // Elemente hinzufügen - add()
        artikelListe.add("Laptop");
        artikelListe.add("Maus");
        artikelListe.add("Tastatur");

        IO.println(artikelListe);

        // Einzelne Elemente abrufen - get()
        IO.println(artikelListe.get(1));

        // Erstes Element abrufen
        IO.println(artikelListe.getFirst());

        // Letztes Element abrufen
        IO.println(artikelListe.getLast());

        // Index eines Elements herausfinden -  indexOf()
        int index = artikelListe.indexOf("Tastatur");
        IO.println("Index von Tastatur: " + index);

        // Prüfen, ob Element vorhanden - contains()
        boolean tastaturExists = artikelListe.contains("Tastatur");
        IO.println("Tastatur existiert? " + tastaturExists);

        // Elemente entfernen - remove() -> durch Index oder durch das Element
        artikelListe.remove(2);
        IO.println("Liste nach remove durch Index: " + artikelListe);

        artikelListe.remove("Laptop");
        IO.println("Liste nach remove durch Objekt selbst: " + artikelListe);

        // Prüfen, ob die Liste leer ist - isEmpty()
        IO.println("Meine Liste ist leer: " +  artikelListe.isEmpty());

        artikelListe.add("Handy");
        artikelListe.add("Taschenrechner");

        IO.println(artikelListe);

        // Elemente ersetzen - set()
        artikelListe.set(0, "Trackpad");
        IO.println("Liste nach set(): " + artikelListe);

        // Element innerhalb der bestehenden Liste "einschieben" - add
        artikelListe.add(1, "Maus");
        IO.println("Maus an 2. Stelle hinzugefügt: " + artikelListe);

        // Größe der Liste - size()
        IO.println("Größe: " + artikelListe.size());

        // Liste leeren - clear()
        artikelListe.clear();
        IO.println("Liste nach clear: " + artikelListe);


    }
}
