package Lektion_9.ÜB3_Raumbelegung;

public class MainRaum {
    public static void main(String[] args) {
        Raum raum1  = new Raum ("I.2.1", 150);
        Raum raum2 = new Raum("I.2.15", 30);


        // Belegungsstatus der Räume abfragen
        System.out.println("Ist Raum " + raum1.getKennung() + " belegt? " + raum1.isRaumBelegt());
        System.out.println("Ist Raum " + raum2.getKennung() + " belegt? " + raum2.isRaumBelegt());

        // Raum I.2.1 belegen
        System.out.println("\nRaum I.2.1 wird belegt...");
        raum1.belegeRaum();

        // Belegungsstatus erneut abfragen
        System.out.println("\nIst Raum " + raum1.getKennung() + " belegt? " + raum1.isRaumBelegt());
        System.out.println("Ist Raum " + raum2.getKennung() + " belegt? " + raum2.isRaumBelegt());
    }
}
