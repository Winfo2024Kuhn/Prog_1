package Lektion_4;
import java.util.Scanner;

public class L4_ÜB2_FreierFall_a {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        final float G = 9.80665f; // Fallbeschleunigung in Meter/Sekunde, final, da unveränderlich
        double ZS; // Zurückgelegte Strecke in m
        int t; // Vergangene Zeit in Sekunden

        System.out.println("Bitte Falldauer in Sekunden eingeben:");

        int eingabe = scanner.nextInt();
        for (t = 1; t <= eingabe; t++) {
            ZS = (G / 2) * (t * t);
            System.out.println("Zeit: " + t + " Sekunden: Zurückgelegte Strecke: " + ZS + " m");
            Thread.sleep(1000);
        }
    }
}

