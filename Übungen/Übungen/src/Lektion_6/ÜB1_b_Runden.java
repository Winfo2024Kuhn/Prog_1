package Lektion_6;

import java.util.Scanner;

import static Lektion_6.Methoden.rundenAnzahlNachkommastellen;

public class ÜB1_b_Runden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double eingabe1 = scanner.nextDouble();
        int eingabe2 = scanner.nextInt();

        System.out.println(rundenAnzahlNachkommastellen(eingabe1, eingabe2));

    }
}