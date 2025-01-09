package Lektion_3;
import java.util.Scanner;
public class L3_ÜB2_Pizzarechner {
        public static void main(String[] args) {
            // Scanner für Benutzereingaben initialisieren
            Scanner scanner = new Scanner(System.in);

            // Benutzer nach den Werten für die erste Pizza fragen
            System.out.print("Geben Sie den Durchmesser der ersten Pizza in cm ein: ");
            int durchmesser1 = scanner.nextInt();
            System.out.print("Geben Sie den Preis der ersten Pizza in Euro ein: ");
            double preis1 = scanner.nextDouble();

            // Benutzer nach den Werten für die zweite Pizza fragen
            System.out.print("Geben Sie den Durchmesser der zweiten Pizza in cm ein: ");
            int durchmesser2 = scanner.nextInt();
            System.out.print("Geben Sie den Preis der zweiten Pizza in Euro ein: ");
            double preis2 = scanner.nextDouble();

            //Berechnung der Kreisfläche
            double radius1 = durchmesser1 / 2.0;
            double radius2 = durchmesser2 / 2.0;

            double fläche1 = Math.PI * (radius1 * radius1);
            double fläche2 = Math.PI * (radius2 * radius2);

            // Preis pro Quadratzentimeter berechnen
            double preisProCm1 = preis1 / fläche1;
            double preisProCm2 = preis2 / fläche2;

            // Ausgabe des besseren Preis-/Größenverhältnisses
            if (preisProCm1 < preisProCm2) {
                System.out.println("Die erste Pizza hat das bessere Preis-/Größenverhältnis.");
            } else if (preisProCm1 > preisProCm2) {
                System.out.println("Die zweite Pizza hat das bessere Preis-/Größenverhältnis.");
            } else {
                System.out.println("Beide Pizzen haben das gleiche Preis-/Größenverhältnis.");
            }

            // Scanner schließen
            scanner.close();
        }
}

