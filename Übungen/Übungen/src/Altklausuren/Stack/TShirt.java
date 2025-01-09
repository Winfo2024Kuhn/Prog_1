package Altklausuren.Stack;

public class TShirt {
    String farbe;
    String marke;
    public TShirt(String farbe, String marke){
        this.farbe = farbe;
        this.marke = marke;
    }
    public String toString(){
    return "Farbe: " + farbe + ", Marke: " + marke + "\n";
    }
}
