package tag4._04;

import javax.swing.*;
import java.util.ArrayList;

public class Einkaufsliste {
    static void main() {
        // ArrayList initialisieren
        ArrayList<String> artikelListe = new ArrayList<>();

        while (true){
            // Auswahl was der User möchte
            String jOptionAction = JOptionPane.showInputDialog("Was möchtest du tun? \n Eingabe(e) \n Liste anzeigen(l) \n Artikel löschen (d)  \n Programm beenden (fertig): ");

            if(jOptionAction.equalsIgnoreCase("e")){
                IO.println("--> Artikel Eingabe"); // Anzeige wo sich der User befindet
                while(true) {

                    //Nutzereingabe
                    String jOptionArtikelEingabe = JOptionPane.showInputDialog("Gib deinen Artikel oder fertig ein:");
                    //Hinzufügen zur Liste
                    artikelListe.add(jOptionArtikelEingabe);
                    IO.println("Deine aktuelle Einkaufsliste");
                    IO.println(artikelListe); // Anzeige der Liste
                    IO.println("Aktuell " + artikelListe.size() + " Artikel auf der Liste."); // Anzeige der Listenlänge

                    //Abbruch der Schleife
                    if (jOptionArtikelEingabe.equalsIgnoreCase("fertig")) {
                        break;
                    }
                }
            }

            // Artikelliste anzeigen
            else if(jOptionAction.equalsIgnoreCase("l")){
                IO.println("--> Artikelliste anzeigen"); // Anzeige wo sich der User befindet
                IO.println(artikelListe); // Anzeige der Liste
                IO.println("Aktuell " + artikelListe.size() + " Artikel auf der Liste."); // Anzeige der Listenlänge
            }

            // Artikel löschen
            else if(jOptionAction.equalsIgnoreCase("d")){
                IO.println("--> Artikel löschen"); // Anzeige wo sich der User befindet

                while (true) {
                    //Nutzereingabe
                    String jOptionArtikelLoeschen = JOptionPane.showInputDialog("Gib den zu löschenden Artikel oder fertig ein: ");
                    //Artikel von der Liste löschen
                    artikelListe.remove(jOptionArtikelLoeschen);
                    IO.println("Artikel " + jOptionArtikelLoeschen + " gelöscht");
                    IO.println(artikelListe); // Anzeige der Liste
                    IO.println("Aktuell " + artikelListe.size() + " Artikel auf der Liste."); // Anzeige der Listenlänge

                    //Abbruch der Schleife
                    if (jOptionArtikelLoeschen.equalsIgnoreCase("fertig")) {
                        break;
                    }
                }
            }

            //Abbruch der Schleife
            else if (jOptionAction.equalsIgnoreCase("fertig")) {
                break;
            }

            // Default Rückgabe
            else {
                IO.println("Ungültige Eingabe");
            }
        }
    }
}
