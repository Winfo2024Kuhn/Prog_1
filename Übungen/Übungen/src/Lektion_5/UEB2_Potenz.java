package Lektion_5;

public class UEB2_Potenz {
    public static double potenz(double basis, int exponent) {
        double ergebnis = 1.0;

        if (exponent == 0) {
            return 1.0; // Jede Zahl hoch 0 ist 1
        } else if (exponent < 0) {
            // Berechnung für negativen Exponenten
            for (int i = 0; i < -exponent; i++) {
                ergebnis *= (1 / basis);
            }
        } else {
            // Berechnung für positiven Exponenten
            for (int i = 0; i < exponent; i++) {
                ergebnis *= basis;
            }
        }

        return ergebnis;
    }
}

