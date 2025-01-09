package Lektion_9.ÜB4_Flasche;

public class MainFlasche {
    // Main-Methode
    public static void main(String[] args) {
        // Flasche mit gültigen Werten erstellen
        Flasche flasche1 = new Flasche("Sprudelwasser", "Frisches Quellwasser", 1000);

        // Flasche mit ungültiger Kapazität erstellen
        Flasche flasche2 = new Flasche("Prog 1", "SoSe 23", 750);
        while (flasche2.getFüllstand() > 0) {
            flasche2.reduziereFuellstand(130);
        }
        while (flasche1.getFüllstand() > 0) {
            flasche1.reduziereFuellstand(130);
        }

        // Beide Flaschen ausgeben
        Flasche.print(flasche1);
    }
}
