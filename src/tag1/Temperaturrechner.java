package tag1;

import javax.swing.*;

public class Temperaturrechner {
    //public static void main(String[] args) {
    static void main(){
        // ---------------------------------------------------------
        // Aufgabe 2: Temperaturrechner
        // Lies eine Temperatur in Celsius ein und wandle sie
        // in Fahrenheit um.
        // Formel: F = C * 1.8 + 32
        // ---------------------------------------------------------

        String jOptionTemperatur = JOptionPane.showInputDialog("Gib die Temperatur in Celsius ein: ");

        double tempCelsius = Double.parseDouble(jOptionTemperatur);

        double tempFahrenheit = tempCelsius * 1.8 + 32;

        IO.println("Die Temperartur " + tempCelsius + " in Celsius entspricht " + tempFahrenheit + " in Fahrenheit.");
    }
}
