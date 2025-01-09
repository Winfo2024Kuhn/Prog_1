package Lektion_6;

import java.util.Scanner;

import static Lektion_6.Methoden.*;

public class ÜB2_Fakultät {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein...");
        int zahl = scanner.nextInt();
        System.out.println("Das Ergebnis der Fakultät " + zahl + " beträgt:");
        System.out.println(fakultätBerechnen(zahl));

    }
}
