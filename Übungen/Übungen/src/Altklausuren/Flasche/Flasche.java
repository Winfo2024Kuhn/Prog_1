package Altklausuren.Flasche;

public class Flasche {
    String name;
    String text;
    int kapazität;
    int fuellstand;

    public Flasche(String name, String text, int kapazität) {
        this.name = name;
        this.text = text;
        if (kapazität <= 0) {
            throw new RuntimeException("Der Füllstand musss größer 0 sein!");
        } else {
            this.kapazität = kapazität;
            this.fuellstand = kapazität;
        }
    }

    public int reduziereFuellstand(int redMenge) {
        if (fuellstand - redMenge <= 0) {
            int temp = fuellstand;
            fuellstand = 0;
            return temp;
        } else {
            fuellstand -= redMenge;
            return redMenge;
        }
    }

    public boolean istLeer() {
        if (fuellstand == 0) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Flasche f = new Flasche("Prog 1", "SoSe 23", 750);
        while (!f.istLeer()) {
            int i = f.reduziereFuellstand(130);
            System.out.println("Es konnten " + i + " ml entnommen werden.");
            System.out.println("Der neue Füllstand beträgt: " + f.fuellstand);
        }
    }
}


