package Altklausuren.Navigationssystem;

import java.util.Scanner;

public class MainMethode {
    public static void main(String[] args) {
        Fahrstrecke reise = new Fahrstrecke();
        Zielort[] routen = new Zielort[4];

        routen[0] = new Zielort("Emil und Eileen", 3);
        routen[1] = new Zielort("Jolina", 5);
        routen[2] = new Zielort("Marvin und Elena", 7);
        routen[3] = new Zielort("Amilia", 7);

        // Alle Personen in die Fahrstrecke (verkettete Liste) einfügen
        for (Zielort z : routen) {
            reise.einfuegen(z);
        }

        // Scanner für Nutzereingaben
        Scanner sc = new Scanner(System.in);
        System.out.println("Drücke 'a', um den nächsten Gewinner zu ziehen. Drücke 'x', um abzubrechen.\n");

        // Solange die Liste nicht leer ist, wiederholen
        while (true) {
            // Prüfen, ob Liste schon leer ist
            if (reise.istLeer()) {
                System.out.println("Alle Personen haben bereits ein Geschenk geöffnet.");
                break;
            }

            System.out.print("Eingabe (a=weiter, x=beenden): ");
            char eingabe = sc.next().charAt(0);

            if (eingabe == 'x') {
                System.out.println("Abbruch. Auf Wiedersehen!");
                break;
            } else if (eingabe == 'a') {
                Zielort gewinner = reise.entferneZufall();
                if (gewinner != null) {
                    System.out.println("Die Person, die als nächstes Geschenke öffnen darf, ist: "
                            + gewinner.getName());
                } else {
                    System.out.println("Die Liste ist jetzt leer.");
                    break;
                }
            } else {
                System.out.println("Ungültige Eingabe. Bitte 'a' oder 'x' drücken.");
            }
        }

        sc.close();
        System.out.println("Programm beendet.");
    }
}
