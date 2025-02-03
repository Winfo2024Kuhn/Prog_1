package Muetzensammlung;

public class Muetze {
    private String name;
    private int wert;
    Muetze prev;

    public Muetze(String name, int wert) {
        this.name = name;
        this.wert = wert;
    }

    public String getName() {
        return name;
    }

    public int getWert() {
        return wert;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    @Override
    public String toString() {
        return "Meine Mütze " + name + " hat den Wert " + wert + ".";
    }
}
