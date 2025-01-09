package Lektion_6;

public class Methoden {
    public static int zahlRunden(double zahl) {
        return zahl > 0 ? (int) (zahl + 0.5) : (int) (zahl - 0.5);
    }

    public static double rundenAnzahlNachkommastellen(double eingabeZahl, int nachKommastellen) {
        double faktor = 1;

        for (int i = 0; i < nachKommastellen; i++) {
            faktor *= 10;
        }
        double temp = eingabeZahl * faktor;
        int ganzeZahl = (int) temp;
        double dezimalStelle = temp - ganzeZahl;
        if (dezimalStelle >= 0.5) {
            ganzeZahl += 1;
        }
        return ganzeZahl / faktor;
    }

    public static long fakultätBerechnen(int eingabeZahl) {

        long ergebnis = 1; // Verwenden von long für größere Werte
        for (int i = 1; i <= eingabeZahl; i++) {
            // Überprüfen, ob das Ergebnis die Grenze von Long überschreiten könnte
            if (ergebnis > Long.MAX_VALUE / i) {
                System.out.println("Das Ergebnis ist zu groß und überschreitet die Kapazität von long.");
                System.out.println("Die maximale Eingabe beträgt !" + (i - 1));
                return 0;
            }
            ergebnis *= i;
        }

        return ergebnis;
    }

    public static String dreieckAusSternenA(int zeilen) {
        String ausgabeStern = "";
        String Stern = "*  ";

        for (int i = 1; i <= zeilen; i++) {
            int tempZeile = 0;
            while (tempZeile < i) {
                ausgabeStern += Stern;
                tempZeile++;
            }
            ausgabeStern += "\n";
        }
        return ausgabeStern;
    }

    public static void dreieckAusSternenB(int zeilen) {
        for (int i = 1; i <= zeilen; i++) {
            // Leerzeichen für Zentrierung
            for (int j = 1; j <= zeilen - i; j++) {
                System.out.print(" ");
            }

            // Sterne mit Leerzeichen dazwischen
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Zeilenumbruch
            System.out.println();
        }
    }

}
