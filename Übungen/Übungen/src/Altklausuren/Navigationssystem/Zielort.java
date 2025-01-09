package Altklausuren.Navigationssystem;

public class Zielort {
    private String name;
    private int index;  // z.B. Distanz, Position oder was du möchtest
    Zielort next;

    public Zielort(String name, int index) {
        this.name = name;
        this.index = index;
        next = null;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
