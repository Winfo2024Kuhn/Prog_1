package Lektion_4;

import java.util.Scanner;

public class L4_ÜB5_Querprodukt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zahl;

        do {
            System.out.println("Geben Sie bitte eine Zahl zwischen 1 und 1.000.000 ein: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ungültige Eingabe. Bitte eine ganze Zahl eingeben: ");
                scanner.next();//Scanner leeren!
            }
            zahl = scanner.nextInt();
        } while (zahl < 1 || zahl > 1000000);

        int ergebnis = 1;
        while (zahl > 1) {
            ergebnis *= (zahl % 10);
            zahl /= 10;
        }

        System.out.println("Ihr Querprodukt beträgt: " + ergebnis);
        scanner.close();
    }
}
