package Altklausuren.Mannschaftsbaum;

public class Mannschaft {
    private  String name;
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
    public void setTore(int tore){
        this.tore = tore;
    }
    public void setGegentore(int gegentore){
        this.gegentore = gegentore;
    }
}
