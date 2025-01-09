package Lektion_3;
import java.util.Scanner;

public class L3_ÜB7_GültigeUhrzeit {
    public static void main(String[] args) {
        // Scanner für die Benutzereingabe
        Scanner scanner = new Scanner(System.in);

        // Einlesen der Stunden, Minuten und Sekunden
        System.out.print("Geben Sie die Stunden ein (0-23): ");
        int stunden = scanner.nextInt();
        System.out.print("Geben Sie die Minuten ein (0-59): ");
        int minuten = scanner.nextInt();
        System.out.print("Geben Sie die Sekunden ein (0-59): ");
        int sekunden = scanner.nextInt();

        // Überprüfung, ob die Uhrzeit gültig ist
        if (stunden >= 0 && stunden <= 23) {
            if (minuten >= 0 && minuten <= 59) {
                if (sekunden >= 0 && sekunden <= 59) {
                    System.out.println("Die eingegebene Uhrzeit " + stunden + ":" + minuten + ":" + sekunden + " ist gültig.");
                } else {
                    System.out.println("Ungültige Sekunden! Sekunden müssen zwischen 0 und 59 liegen.");
                }
            } else {
                System.out.println("Ungültige Minuten! Minuten müssen zwischen 0 und 59 liegen.");
            }
        } else {
            System.out.println("Ungültige Stunden! Stunden müssen zwischen 0 und 23 liegen.");
        }

        // Scanner schließen
        scanner.close();
    }
}
