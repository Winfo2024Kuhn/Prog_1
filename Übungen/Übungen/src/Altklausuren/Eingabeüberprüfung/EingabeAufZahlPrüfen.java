package Altklausuren.Eingabeüberprüfung;

import java.util.Scanner;

public class EingabeAufZahlPrüfen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");
        boolean isInteger = false;
        int zahl;
        String temp;
        do {
            String eingabe = s.nextLine();
            char[] c = eingabe.toCharArray();
            temp = "";

            for (int i = 0; i < c.length; i++) {
                isInteger = false;
                if (c[i] < '0' || c[i] > '9'){
                    System.out.print("Geben Sie nur ganze Zahlen ein: ");
                    break;
                }
                else isInteger = true;
                temp += c[i];
            }
        } while (!isInteger);
        zahl = Integer.valueOf(temp);
        System.out.print(zahl);
//        try
//        {
//            int zahl = Integer.valueOf(eingabe);
//        } catch (NumberFormatException e) {
//            System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl ein.");
//        }
    }

    public static int getPotenz(int basis, int exponent) {
        if (exponent <= 0) {
            return 1;
        }
        else return basis * getPotenz(basis,exponent-1);
    }
}
