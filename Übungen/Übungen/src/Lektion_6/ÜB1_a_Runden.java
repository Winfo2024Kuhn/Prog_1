package Lektion_6;

import java.util.Scanner;

import static Lektion_6.Methoden.zahlRunden;

public class ÜB1_a_Runden {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die zu rundende Zahl ein...");
        double eingabe = scanner.nextDouble();
        System.out.println(zahlRunden(eingabe));
    }
}
