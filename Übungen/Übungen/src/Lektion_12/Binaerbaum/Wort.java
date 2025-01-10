package Lektion_12.Binaerbaum;

public class Wort {
    String wort;
    String bedeutung;

    public Wort(String wort, String bedeutung) {
        this.wort = wort;
        this.bedeutung = bedeutung;
    }

    public String toString() {
        return "Wort: " + wort + " Bedeutung: " + bedeutung + "\n";
    }
}
