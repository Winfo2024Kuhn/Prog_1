package Lektion_6;

import java.util.Scanner;

import static Lektion_6.Methoden.dreieckAusSternenA;
import static Lektion_6.Methoden.dreieckAusSternenB;

public class ÜB3_Stern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie 1 oder 2 ein:");
        int eingabe1 = scanner.nextInt();
        System.out.println("Geben Sie die Anzahl der Zeilen ein:");
        int eingabe2 = scanner.nextInt();
        if (eingabe1 == 1) {
            System.out.println(dreieckAusSternenA(eingabe2));
        } else if (eingabe1 == 2) {
            dreieckAusSternenB(eingabe2);
        }
    }
}
