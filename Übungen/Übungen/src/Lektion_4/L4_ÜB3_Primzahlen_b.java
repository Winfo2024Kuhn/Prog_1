package Lektion_4;
import java.util.Scanner;

public class L4_ÜB3_Primzahlen_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte eine ganze Zahl eingeben: ");
        int eingabe = scanner.nextInt();

        //1 und kleiner 1 ist keine Primzahl
        if (eingabe <= 1) {
            System.out.println(eingabe + " ist keine Primzahl.");
        } else {
            // Schleife für jede Zahl von 2 bis zur Eingabe
            for (int zähler = 2; zähler <= eingabe; zähler++) {
                boolean istPrimzahl = true;
                // Überprüfung, ob der aktuelle Zähler ganzzahlig durch einen fortlaufenden Teiler teilbar ist
                for (int teiler = 2; teiler <= zähler / 2; teiler++) {
                    if (zähler % teiler == 0) {
                        istPrimzahl = false; // Wenn ein Teiler gefunden wurde, ist es keine Primzahl
                        break;
                    }
                }
                // Ausgabe, ob die aktuelle Zahl eine Primzahl ist oder nicht
                if (istPrimzahl) {
                    System.out.println(zähler + " ist eine Primzahl.");
                } else {
                    System.out.println(zähler + " ist keine Primzahl.");
                }
            }
        }
        scanner.close();
    }
}
