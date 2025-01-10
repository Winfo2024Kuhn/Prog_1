package Lektion_12.Binaerbaum;

public class Main {
    public static void main(String[] args) {
        Baum baum = new Baum();
        Wort[] woerter = new Wort[4];
        woerter[0] = new Wort("Haus", "Ein Gebäude, das als Wohnstätte dient.");
        woerter[1] = new Wort("Auto", "Ein motorisiertes Fahrzeug zur Fortbewegung.");
        woerter[2] = new Wort("Baum", "Eine große Pflanze mit einem holzigen Stamm.");
        woerter[3] = new Wort("Buch", "Eine Sammlung von Seiten mit Text oder Bildern.");



        for (int i = 0; i < woerter.length; i++){
            Knoten k = new Knoten(woerter[i]);
            baum.insert(k);
        }

        baum.print();
        baum.deleteKnoten(woerter[0]);
        System.out.println();
        baum.print();

    }
}
