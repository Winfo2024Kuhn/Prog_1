package Lektion_4;

public class l4_ÜB4_Temperaturtabelle {
    public static void main(String[] args){
        System.out.printf("%-10s %10s%n", "Fahrenheit", "Celsius");

        for (int fahrenheit = 0; fahrenheit <= 300; fahrenheit++){
            float celsius = (5f / 9) * (fahrenheit - 32);
            // Verwende printf für die Formatierung der Tabelle
            System.out.printf("%-10d %10.2f", fahrenheit, celsius);
        }
    }
}

