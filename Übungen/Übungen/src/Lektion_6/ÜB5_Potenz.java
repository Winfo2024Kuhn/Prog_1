package Lektion_6;

import java.util.Scanner;
import static Lektion_6.Methoden_Rekursiv.pow;

public class ÜB5_Potenz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Basis an:");
        int basis = scanner.nextInt();
        System.out.println("Geben Sie den Exponenten an:");
        int exponent = scanner.nextInt();
        System.out.println("Das Ergebnis beträgt " + pow(basis,exponent));
    }
}
