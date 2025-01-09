package Lektion_3;
import java.util.Scanner;

public class L3_ÜB5_Matrikelnummer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie Ihre Matrikelnummer ein: ");
        String matrikelnummer = scanner.nextLine();

        if (matrikelnummer.length() == 7) {
            char first = matrikelnummer.charAt(0);
            char second = matrikelnummer.charAt(1);

            if ((first == '5' && (second == '0' || second == '1')) || (first == '6' && second == '1')) {
                System.out.println("Die Matrikelnummer ist gültig.");
            } else {
                System.out.println("Ungültige Matrikelnummer: Die Nummer muss mit 50, 51 oder 61 beginnen.");
            }
        } else {
            System.out.println("Ungültige Matrikelnummer: Die Nummer muss genau 7-stellig sein.");
        }
        scanner.close();
    }
}


