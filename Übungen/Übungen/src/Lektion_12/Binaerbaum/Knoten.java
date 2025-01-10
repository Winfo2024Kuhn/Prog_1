package Lektion_12.Binaerbaum;

public class Knoten {
    Wort wort;
    Knoten left;
    Knoten right;

    public Knoten(Wort wort) {
        this.wort = wort;
    }

    public Wort getWort() {
        return this.wort;
    }

    public Knoten getLeft() {
        return left;
    }

    public Knoten getRight() {
        return right;
    }
}
