package Lektion_3;
import java.util.Scanner;

public class L3_ÜB3_Einzelzeichen {
    public static void main(String[] args) {
        // Scanner für die Benutzereingabe
        Scanner scanner = new Scanner(System.in);

        // Eingabe eines Einzelzeichens
        System.out.print("Geben Sie ein einzelnes Zeichen ein: ");
        String Einzelzeichen = scanner.nextLine();
        char c = Einzelzeichen.charAt(0);

        boolean bekannt = false;

        // Überprüfen, ob es ein Großbuchstabe ist
        if (c >= 'A' && c <= 'Z') {
            System.out.println("Großbuchstabe");
            bekannt = true;
        }

        // Überprüfen, ob es eine hexadezimale Ziffer ist (0-9, a-f, A-F)
        if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F')) {
            System.out.println("Hexadezimale Ziffer");
            bekannt = true;
        }

        // Überprüfen, ob es eine binäre Ziffer ist (0 oder 1)
        if (c == '0' || c == '1') {
            System.out.println("Binäre Ziffer");
            bekannt = true;
        }

        // Überprüfen, ob es eine oktale Ziffer ist (0-7)
        if (c >= '0' && c <= '7') {
            System.out.println("Oktale Ziffer");
            bekannt = true;
        }

        // Wenn keine der Kategorien zutrifft
        if (!bekannt) {
            System.out.println("Unbekannt");
        }

        scanner.close();
    }
}
