package Lektion_12.ÜB1_Lottospiel;

public class Knoten {
    private int value;
    Knoten next;

    public Knoten(int value) {
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}
