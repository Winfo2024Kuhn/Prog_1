package Lektion_9.ÜB3_Raumbelegung;

public class Raum {
    private String kennung;
    private int maxStudenten;
    private boolean RaumBelegt;

    public Raum(String name, int maxStudenten) {
        this.kennung = name;
        if (maxStudenten < 1) {
            this.maxStudenten = 50;
        } else this.maxStudenten = maxStudenten;
        this.RaumBelegt = false;

    }

    // Getter für Kennung
    public String getKennung() {
        return kennung;
    }

    public boolean isRaumBelegt() {
        return RaumBelegt;
    }

    public void belegeRaum() {
        if (!RaumBelegt) {
            RaumBelegt = true;
            System.out.println("Der Raum " + kennung + " ist jetzt belegt.");
        } else System.out.println("Der Raum " + kennung + " ist bereits belegt.");
    }
}
