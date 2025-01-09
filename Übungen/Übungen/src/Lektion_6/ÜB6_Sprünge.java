package Lektion_6;

import java.util.Scanner;

import static Lektion_6.Methoden_Rekursiv.springeInMehrerenSprüngen;

public class ÜB6_Sprünge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Distanz in Metern an:");
        int distanz = scanner.nextInt();
        System.out.println("Geben Sie den Sprungweite 1 in Metern an:");
        int sprungweite1 = scanner.nextInt();
        System.out.println("Geben Sie den Sprungweite 2 in Metern an:");
        int sprungweite2 = scanner.nextInt();
        System.out.println("Die anzahl der Möglichkeiten beträgt " + springeInMehrerenSprüngen(distanz, sprungweite1, sprungweite2));
    }
}
