package Lektion_6;

public class Methoden_Rekursiv {

    public static double pow(int basis, int potenz) {
        if (potenz == 0) return 1;
        if (potenz < 0) {
            return 1.0 / basis * pow(basis, potenz + 1);
        } else return basis * pow(basis, potenz - 1);
    }

    public static int springeInMehrerenSprüngen(int distanz, int sprung1, int sprung2) {

        if (distanz < 0) return 0;
        if (distanz == 0) return 1;

        int anzahlMöglichkeiten = 0;
        anzahlMöglichkeiten += springeInMehrerenSprüngen(distanz - sprung1, sprung1, sprung2);
        anzahlMöglichkeiten += springeInMehrerenSprüngen(distanz - sprung2, sprung1, sprung2);
        return anzahlMöglichkeiten;

    }
}
