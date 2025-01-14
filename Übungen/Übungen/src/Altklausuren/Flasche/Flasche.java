package Altklausuren.Flasche;

public class Flasche {
    String name;
    String text;
    int kapazität;
    int füllstand;

    public Flasche(String name, String text, int kapazität) {
        this.name = name;
        this.text = text;

        if (kapazität > 0) {
            this.kapazität = kapazität;
            this.füllstand = kapazität;
        } else {
            throw new RuntimeException("Der Füllstand muss positiv sei!");
        }
    }

    public int reduziereFuellstand(int reduzierendeMenge) {
        if (füllstand > reduzierendeMenge) {
            füllstand -= reduzierendeMenge;
            return reduzierendeMenge;
        } else{
            int temp = füllstand;
            füllstand = 0;
            return temp;
        }
    }

    public boolean istLeer() {
        return füllstand == 0;
    }

    public static void main(String[] args) {
        Flasche f = new Flasche("Prog 1", "SoSe 23", 750);
        while (!f.istLeer()) {
            int i = f.reduziereFuellstand(130);
            System.out.println("Die entnommene Menge ist: " + i);
        }
    }
}

