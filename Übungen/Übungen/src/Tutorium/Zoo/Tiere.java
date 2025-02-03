package Tutorium.Zoo;

public class Tiere {
    String name;
    int groesse;

    Tiere left;
    Tiere right;

    public Tiere(String name, int groesse){
        this.name = name;
        this.groesse = groesse;
    }
    public String toString(){
        return "Mein Tier " + name + " ist " + groesse + " cm groß -> ";
    }
}
