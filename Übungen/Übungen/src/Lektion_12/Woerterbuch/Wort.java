package Lektion_12.Woerterbuch;

public class Wort {
    private String name;
    private String bedeutung;

    public Wort(String name, String bedeutung){
        this.name = name;
        this.bedeutung = bedeutung;
    }
    public String getName(){
        return name;
    }
    public String getBedeutung(){
        return bedeutung;
    }
    public String toString(){
        return "Wort: " + name + ", Bedeutung: " + bedeutung;
    }
}
