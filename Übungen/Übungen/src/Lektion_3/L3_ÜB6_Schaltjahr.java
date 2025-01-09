package Lektion_3;
import java.util.Scanner;

public class L3_ÜB6_Schaltjahr {
    public static void main(String[] args) {
        // Scanner für die Benutzereingabe
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Jahreszahl
        System.out.print("Bitte geben Sie eine Jahreszahl ein: ");
        int jahr = scanner.nextInt();

        // Überprüfung, ob es ein Schaltjahr ist
        if (jahr % 4 == 0 && !(jahr % 100 == 0) || jahr % 400 == 0){
                System.out.println(jahr + " ist ein Schaltjahr.");
        } else {
            System.out.println(jahr + " ist kein Schaltjahr.");
        }

        // Scanner schließen
        scanner.close();
    }
}

