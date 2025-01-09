package Lektion_6;

import java.util.Scanner;

import static Lektion_4.PrimzahlPrüfer.primzahl;

public class ÜB4_Primzahl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zahl = scanner.nextInt();
        System.out.println("Geben Sie die zu überprüfende Zahl ein.");
        if (primzahl(zahl) == true) {
            System.out.println("Die eingegebene Zahl ist eine PrimzahlPrüfer");
        } else System.out.println("Die eingegebene Zahl ist keine Primzahl");
    }
}
