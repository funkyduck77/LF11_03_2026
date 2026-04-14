package tag7.static_keyword;

public class App {
    static void main() {

        IO.println(Fahrzeug.getAnzahlFahrzeuge());

        Fahrzeug fahrzeug = new Fahrzeug(2020);
        Fahrzeug fahrzeug1 = new Fahrzeug(2020);

        IO.println(Fahrzeug.getAnzahlFahrzeuge());

        Auto meinAuto = new Auto(2020, 4);
        Auto meinAuto2 = new Auto(2020, 4);

        IO.println(Fahrzeug.getAnzahlFahrzeuge());


    }
}
