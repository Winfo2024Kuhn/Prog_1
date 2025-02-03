package Altklausuren.HarmonischeReihe;

public class harmonischeReihe {
    public static void main(String[] args) {
        double ergebnis = 0;
        double zähler = -1;
        double nenner;
        for (int i = 1; i <= 10000; i++) {
            zähler *= -1;
            nenner = i;
            ergebnis += zähler / nenner;
        }
        System.out.println(ergebnis);
    }
}
