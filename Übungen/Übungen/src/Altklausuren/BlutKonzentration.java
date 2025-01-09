package Altklausuren;

public class BlutKonzentration {
    // Dichte des Alkohols
    static final float p = 0.8f; // p entspricht der Dichte von Alkohol Gramm/l

    public static void main(String[] args) {
        int v = 1000; // V entspricht dem Volumen des Getränkes in ml
        double e = 0.05; // e entspricht dem Alkoholvolumenanteil bei Bier 0,05 -> 5%
        double a = berechneMasse(v, e); // A entspricht der Masse an Alkohol in Gramm
        System.out.printf("Die Alkoholmasse der Person beträgt: %.2fg \n",a);

        // Person
        int m = 70; // Gewicht der Person in KG
        char typ = 'm'; // Geschlecht
        float w =(float) berechneAlkKonzentration(a, m, typ);
        System.out.printf("Die Blutkonzentration beträgt: %.2f Promille \n",w);
        if (w < 0.3) {
            System.out.println("Sie dürfen noch Auto fahren.");
        } else if (w < 0.5) {
            System.out.println("Sie sollten kein Auto mehr fahren!!!!");
        } else System.out.println("Sie dürfen kein Auto mehr fahren!!!!");

    }


    public static double berechneMasse(double v, double e) {
        return v * e * p;
    }

    public static double berechneAlkKonzentration(double a, double m, char typ) {
        double r;
        switch (typ) {
            case 'w':
                r = 0.6;
                break;
            case 'm':
                r = 0.7;
                break;
            case 'j':
                r = 0.5;
                break;
            default:
                System.out.println("Ungültiger Typ. Bitte geben Sie einen gültigen typ (m,w,j) ein");
                return -1.0;
        }
        return (a / (m * r));
    }
}
