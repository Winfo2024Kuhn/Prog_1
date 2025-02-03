package Altklausuren.Mannschaftsbaum;

public class Mannschaft {
    private String name;
    private int tore;
    private int gegentore;
    public Mannschaft(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getTore(){
        return tore;
    }
    public int getGegentore(){
        return gegentore;
    }
    public void setTore(int in){
        tore = in;
    }
    public void setGegentore(int in){
        gegentore = in;
    }
    public String toString(){
        return "Mannschaft: "+ name + " Tore: " + tore + " Gegentore: " + gegentore;
    }
}
