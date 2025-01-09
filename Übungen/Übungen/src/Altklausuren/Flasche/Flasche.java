package Altklausuren.Flasche;

public class Flasche {
    String name;
    String text;
    int kapazität; // ml
    int füllstand;

    public Flasche(String name, String text, int kapazität) {
        this.name = name;
        this.text = text;
        if (kapazität > 0) {
            this.kapazität = kapazität;
        } else kapazität = 1000;
        füllstand = kapazität;
    }

    public void reduziereFuellstand(int reduzierendeMenge) {
        if ((füllstand - reduzierendeMenge) > 0) {
            füllstand -= reduzierendeMenge;
            System.out.println("Reduzierter Füllstand " + reduzierendeMenge + "ml");
            System.out.println("Neuer Füllstand " + füllstand + "ml");

        } else {
            System.out.println("Es konnten nur " + füllstand + "ml entnommen werden");
            füllstand = 0;
        }
    }

    public boolean istLeer() {
        if (füllstand == 0) {
            System.out.println("Die Flasche ist leer");
            return true;
        } else return false;
    }

    public String toString() {
        return "Name: " + name + "\nText: " + text + "\nKapazität: " + kapazität + "ml" + "\nFüllstand: " + füllstand + "ml";
    }


}
