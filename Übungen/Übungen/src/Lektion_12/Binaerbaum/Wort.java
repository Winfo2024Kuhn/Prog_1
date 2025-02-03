package Lektion_12.Binaerbaum;

public class Wort {
    String name;
    String bedeutung;

    public Wort(String name, String bedeutung) {
        this.name = name;
        this.bedeutung = bedeutung;
    }

    public String toString() {
        return "Wort: " + name + " Bedeutung: " + bedeutung + "\n";
    }

}
