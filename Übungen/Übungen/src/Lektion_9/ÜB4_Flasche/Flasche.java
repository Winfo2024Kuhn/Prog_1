package Lektion_9.ÜB4_Flasche;

public class Flasche {
    // Attribute der Klasse (privat für Information Hiding)
    private String name; // Name der Flasche
    private String text; // Text auf der Flasche (Etikett)
    private int kapazität; // Kapazität in ml
    private int füllstand; // Aktueller Füllstand in ml
    private boolean istLeer;

    // Konstruktor mit Überprüfung der Kapazität
    public Flasche(String name, String text, int kapazität) {
        this.name = name;
        this.text = text;

        // Kapazität prüfen (muss > 0 sein)
        if (kapazität > 0) {
            this.kapazität = kapazität;
        } else {
            this.kapazität = 1000; // Standardwert: 1 Liter
        }

        this.füllstand = this.kapazität; // Flaschen sind standardmäßig voll
        istLeer = false;
    }

    // Getter-Methoden für die Attribute (falls benötigt)
    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public int getKapazität() {
        return kapazität;
    }

    public int getFüllstand() {
        return füllstand;
    }

    //Setter-Methoden für die Attribute
    public void setFüllstand(int x) {
        if (x < 0) { // Füllstand darf nicht negativ sein
            System.out.println("Der Füllstand kann nicht negativ sein. Der Wert bleibt unverändert.");
        } else if (x > kapazität) { // Füllstand darf Kapazität nicht überschreiten
            System.out.println("Der Füllstand kann die Kapazität der Flasche nicht überschreiten. Setze auf maximale Kapazität.");
            this.füllstand = kapazität; // Setze auf maximale Kapazität
        } else {
            this.füllstand = x; // Setze auf den übergebenen Wert
        }
    }

    // Methoden, um die Flasche zu leeren (optional)
    public void entleeren() {
        this.füllstand = 0; // Füllstand auf 0 setzen
        istLeer(this);
    }

    // Methode, um die Flasche zu füllen (optional)
    public void füllen() {
        this.füllstand = this.kapazität; // Füllstand auf maximale Kapazität setzen
    }

    // Methode, um alle Attribute der Flasche auszugeben
    public static void print(Flasche f) {
        System.out.printf("%-12s %s%n","Name: ", f.name);
        System.out.printf("%-12s %s%n","Text: ", f.text);
        System.out.printf("%-12s %s%n","Kapazität: ", f.kapazität + " ml");
        System.out.printf("%-12s %s%n","Füllstand: ", f.füllstand + " ml\n");
    }

    public void reduziereFuellstand(int redMl) {
        if (redMl > füllstand) {
            System.out.println(name + ": Es konnten nur " + (redMl - füllstand) + " ml entnommen werden.");
            füllstand = 0;
        } else {
            füllstand = füllstand - redMl;
            System.out.println(name + ": Es wurden " + redMl + " ml entnommen.");
            return;
        }
        istLeer(this);
    }

    public boolean istLeer(Flasche flasche) {
        if (füllstand == 0) {
            istLeer = true;
            System.out.println("Die Flasche " + name + " ist jetzt leer \n");
            return true;
        } else {
            istLeer = false;
            return false;
        }
    }
}


