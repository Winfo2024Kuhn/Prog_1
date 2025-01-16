package Altklausuren.Navigationssystem;

public class Zielort {
    private String name;
    private int distanz;
    Zielort next;

    public Zielort(String name, int distanz) {
        this.name = name;
        this.distanz = distanz;
    }

    public String getName() {
        return name;
    }

    public int getDistanz() {
        return distanz;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistanz(int distanz) {
        this.distanz = distanz;
    }
    public String toString(){
        return "Ortsname: " + name + " Distanz: " + distanz + " km";
    }

}
