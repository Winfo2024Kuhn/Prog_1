package Lektion_12.Binaerbaum;

public class Main {
    public static void main(String[] args) {
        Baum baum = new Baum();

        baum.insert(new Knoten(new Wort("Haus", "Ein Gebäude, das als Wohnstätte dient.")));
        baum.insert(new Knoten(new Wort("Auto", "Ein motorisiertes Fahrzeug zur Fortbewegung.")));
        baum.insert(new Knoten(new Wort("Baum", "Eine große Pflanze mit einem holzigen Stamm.")));
        baum.insert(new Knoten(new Wort("Buch", "Eine Sammlung von Seiten mit Text oder Bildern.")));
        baum.insert(new Knoten(new Wort("Computer", "Ein elektronisches Gerät zur Datenverarbeitung.")));
        baum.insert(new Knoten(new Wort("Apfel", "Eine essbare Frucht eines Obstbaums.")));
        baum.insert(new Knoten(new Wort("Hund", "Ein Haustier, bekannt als der beste Freund des Menschen.")));
        baum.insert(new Knoten(new Wort("Katze", "Ein kleines, pelziges Haustier mit Schnurrhaaren.")));
        baum.insert(new Knoten(new Wort("Wasser", "Eine farblose Flüssigkeit, die lebensnotwendig ist.")));
        baum.insert(new Knoten(new Wort("Feuer", "Eine chemische Reaktion, die Wärme und Licht erzeugt.")));
        baum.insert(new Knoten(new Wort("Fahrrad", "Ein zweirädriges, pedalgetriebenes Fahrzeug.")));
        baum.insert(new Knoten(new Wort("Schule", "Ein Ort, an dem Bildung vermittelt wird.")));
        baum.insert(new Knoten(new Wort("Lehrer", "Eine Person, die Wissen vermittelt.")));
        baum.insert(new Knoten(new Wort("Schüler", "Eine Person, die lernt.")));
        baum.insert(new Knoten(new Wort("Tisch", "Ein Möbelstück mit einer flachen Oberfläche.")));
        baum.insert(new Knoten(new Wort("Stuhl", "Ein Möbelstück zum Sitzen.")));
        baum.insert(new Knoten(new Wort("Telefon", "Ein Gerät zur Übertragung von Sprache über Entfernungen.")));
        baum.insert(new Knoten(new Wort("Lampe", "Ein Gerät zur Erzeugung von Licht.")));
        baum.insert(new Knoten(new Wort("Fenster", "Eine Öffnung in einer Wand, oft mit Glas.")));
        baum.insert(new Knoten(new Wort("Tür", "Eine bewegliche Barriere zum Betreten eines Raums.")));
        baum.insert(new Knoten(new Wort("Zug", "Ein Transportmittel auf Schienen.")));
        baum.insert(new Knoten(new Wort("Flugzeug", "Ein Luftfahrzeug, das fliegen kann.")));
        baum.insert(new Knoten(new Wort("Schiff", "Ein großes Wasserfahrzeug.")));
        baum.insert(new Knoten(new Wort("Stadt", "Ein größerer, dicht besiedelter Ort.")));
        baum.insert(new Knoten(new Wort("Land", "Ein Gebiet mit eigener Regierung und Grenzen.")));
        baum.insert(new Knoten(new Wort("Planet", "Ein Himmelskörper, der um eine Sonne kreist.")));
        baum.insert(new Knoten(new Wort("Universum", "Die Gesamtheit von Raum, Zeit, Materie und Energie.")));
        baum.insert(new Knoten(new Wort("Bleistift", "Ein Schreibgerät mit einer Mine.")));
        baum.insert(new Knoten(new Wort("Papier", "Ein dünnes Material zum Schreiben oder Drucken.")));
        baum.insert(new Knoten(new Wort("Uhr", "Ein Gerät zur Anzeige der Zeit.")));

        baum.print();
    }
}
