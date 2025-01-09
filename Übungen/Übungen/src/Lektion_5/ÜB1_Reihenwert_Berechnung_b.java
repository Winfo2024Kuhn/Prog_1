package Lektion_5;

public class ÜB1_Reihenwert_Berechnung_b {
    public static void main(String[] args) {
        int k = 1;
        double summe = 0;
        double summand;

        do {
            summand = 6 * (1.0 / Math.pow(k, 2));
            summe += summand;
            k++;
            System.out.println("Nach Durchlauf " + (k - 1) + " beträgt das Ergebnis: " + summe);
        }
        while (summand > 1E-5);
    }
}

// 1. Der endgültige Reihenwert wird um das 6-fache größer sein, als wenn der Faktor nicht vorhanden wäre.
//2. Der Abstand zur nächsten Näherung ist bei jedem Schritt 6-mal größer als ohne diesen Faktor.