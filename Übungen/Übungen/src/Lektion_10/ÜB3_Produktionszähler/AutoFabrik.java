package Lektion_10.ÜB3_Produktionszähler;

public class AutoFabrik {
    private int anzahlProdAutos = 0;

    public Auto produziere(String name, int hubraum, int ps, String farbe) {
        anzahlProdAutos++;
        System.out.println("Neues Auto angefertigt:");
        System.out.printf("%-14s %s%n", "Vornahme: ", name );
        System.out.printf("%-14s %s%n", "Hubraum: ", hubraum );
        System.out.printf("%-14s %s%n", "PS: ", ps );
        System.out.printf("%-14s %s%n", "Farbe: ", farbe );
        return new Auto(name,hubraum,ps,farbe);
    }
    public int getProdAutos(){
        return anzahlProdAutos;
    }

}
