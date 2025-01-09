package Lektion_10.ÜB3_Produktionszähler;

public class Auto {
    String name;
    int hubraum;
    int ps;
    String farbe;
    static int serienNummer = 0;

    public Auto(String name, int hubraum, int ps, String farbe) {
        this.name = name;
        if (hubraum < 0) {
            this.hubraum = 10;
        } else this.hubraum = hubraum;
        if (ps < 0) {
            this.ps = 10;
        } else this.ps = ps;
        this.farbe = farbe;
        serienNummer++;
        System.out.printf("%-14s %s%n%n", "Seriennummer: ", serienNummer);
    }
}
