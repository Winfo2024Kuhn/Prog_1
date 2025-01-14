package Lektion_12.Woerterbuch;

public class Knoten {
    private Wort w;
    Knoten left;
    Knoten right;
    public Knoten(Wort w){
        this.w = w;
    }
    public Wort getWort(){
        return w;
    }
    public void setWort(Wort w){
        this.w = w;
    }
}
