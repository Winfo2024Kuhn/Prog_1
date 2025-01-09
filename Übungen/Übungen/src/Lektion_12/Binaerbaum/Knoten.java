package Lektion_12.Binaerbaum;

public class Knoten {
    String wort;
    String bedeutung;
    Knoten left;
    Knoten right;

    public Knoten(String wort, String bedeutung) {
        this.wort = wort;
        this.bedeutung = bedeutung;
    }
    public String toString(){
        return "Wort: " + wort + " Bedeutung: " + bedeutung + "\n";
    }
}
