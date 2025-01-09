package Lektion_5;

import java.util.Scanner;

public class ÜB5_Pi_Berechnung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die Anzahl der Rechtecke ein: ");
        int n = scanner.nextInt();

        double r = 1.0;
        double a = r / n;
        double pi = 0.0;
        double ak;
        double iR;

        // Rechtecknäherung mit einer for-Schleife
        for (int i = 0; i < n; i++) {
            iR = i * a; //i-tes Rechteck
            ak = Math.sqrt(r * r - iR * iR);//Berechnung Ankathete
            pi += ak * a;
        }

        // Näherung von π berechnen
        pi *= 4;

        // Ergebnis ausgeben
        System.out.println("Die Näherung von pi ist: " + pi);
    }
}

