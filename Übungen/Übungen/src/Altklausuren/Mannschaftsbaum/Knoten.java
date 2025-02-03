package Altklausuren.Mannschaftsbaum;

public class Knoten {
    Mannschaft team;
    Knoten left;
    Knoten right;
    public Knoten(Mannschaft team){
        this.team = team;
        left = null;
        right = null;
    }
}
