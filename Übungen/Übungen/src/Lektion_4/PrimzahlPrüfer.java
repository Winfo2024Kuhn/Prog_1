package Lektion_4;

public class PrimzahlPrüfer {

    public static boolean primzahl(int zahl) {
        if (zahl <= 1) {
            return false; // Zahlen kleiner oder gleich 1 sind keine Primzahlen
        } else {
            for (int i = 2; i <= zahl / 2; i++) {
                if (zahl % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}



