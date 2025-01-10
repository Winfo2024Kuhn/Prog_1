package Lektion_12.Binaerbaum;

public class Main {
    public static void main(String[] args) {
        Baum baum = new Baum();
        Wort[] woerter = new Wort[30];
        woerter[0] = new Wort("Haus", "Ein Gebäude, das als Wohnstätte dient.");
        woerter[1] = new Wort("Auto", "Ein motorisiertes Fahrzeug zur Fortbewegung.");
        woerter[2] = new Wort("Baum", "Eine große Pflanze mit einem holzigen Stamm.");
        woerter[3] = new Wort("Buch", "Eine Sammlung von Seiten mit Text oder Bildern.");
        woerter[4] = new Wort("Computer", "Ein elektronisches Gerät zur Datenverarbeitung.");
        woerter[5] = new Wort("Apfel", "Eine essbare Frucht eines Obstbaums.");
        woerter[6] = new Wort("Hund", "Ein Haustier, bekannt als der beste Freund des Menschen.");
        woerter[7] = new Wort("Katze", "Ein kleines, pelziges Haustier mit Schnurrhaaren.");
        woerter[8] = new Wort("Wasser", "Eine farblose Flüssigkeit, die lebensnotwendig ist.");
        woerter[9] = new Wort("Feuer", "Eine chemische Reaktion, die Wärme und Licht erzeugt.");
        woerter[10] = new Wort("Fahrrad", "Ein zweirädriges, pedalgetriebenes Fahrzeug.");
        woerter[11] = new Wort("Schule", "Ein Ort, an dem Bildung vermittelt wird.");
        woerter[12] = new Wort("Lehrer", "Eine Person, die Wissen vermittelt.");
        woerter[13] = new Wort("Schüler", "Eine Person, die lernt.");
        woerter[14] = new Wort("Tisch", "Ein Möbelstück mit einer flachen Oberfläche.");
        woerter[15] = new Wort("Stuhl", "Ein Möbelstück zum Sitzen.");
        woerter[16] = new Wort("Telefon", "Ein Gerät zur Übertragung von Sprache über Entfernungen.");
        woerter[17] = new Wort("Lampe", "Ein Gerät zur Erzeugung von Licht.");
        woerter[18] = new Wort("Fenster", "Eine Öffnung in einer Wand, oft mit Glas.");
        woerter[19] = new Wort("Tür", "Eine bewegliche Barriere zum Betreten eines Raums.");
        woerter[20] = new Wort("Zug", "Ein Transportmittel auf Schienen.");
        woerter[21] = new Wort("Flugzeug", "Ein Luftfahrzeug, das fliegen kann.");
        woerter[22] = new Wort("Schiff", "Ein großes Wasserfahrzeug.");
        woerter[23] = new Wort("Stadt", "Ein größerer, dicht besiedelter Ort.");
        woerter[24] = new Wort("Land", "Ein Gebiet mit eigener Regierung und Grenzen.");
        woerter[25] = new Wort("Planet", "Ein Himmelskörper, der um eine Sonne kreist.");
        woerter[26] = new Wort("Universum", "Die Gesamtheit von Raum, Zeit, Materie und Energie.");
        woerter[27] = new Wort("Bleistift", "Ein Schreibgerät mit einer Mine.");
        woerter[28] = new Wort("Papier", "Ein dünnes Material zum Schreiben oder Drucken.");
        woerter[29] = new Wort("Uhr", "Ein Gerät zur Anzeige der Zeit.");

        for (int i = 0; i < woerter.length; i++){
            Knoten k = new Knoten(woerter[i]);
            baum.insert(k);
        }

        baum.print();
        System.out.println("Die bedeutung des gesuchten Wertes ist: " +baum.search(woerter[5]));
    }
}
