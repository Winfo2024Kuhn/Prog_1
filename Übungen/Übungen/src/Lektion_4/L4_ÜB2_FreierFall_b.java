package Lektion_4;

import java.util.Scanner;

public class L4_ÜB2_FreierFall_b {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        final float G = 9.80665f; // Fallbeschleunigung in Meter/Sekunde, final, da unveränderlich
        double ZS; // Zurückgelegte Strecke in m
        int t; // Vergangene Zeit in Sekunden
        System.out.println("Bitte Falldauer in Sekunden eingeben:");

        int eingabe = scanner.nextInt();
        for (t = 1; t <= eingabe; t++) {
            ZS = (G / 2) * (t * t);
            Thread.sleep(1000);
            if (t % 6 == 0 || t == eingabe || t == 1) {
                System.out.println("Zeit: " + t + " Sekunden: Zurückgelegte Strecke: " + ZS + " m");
            }
        }
    }
}
