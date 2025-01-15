package Blutkonzentration;

public class WidmarkFormel {
    public static void main(String[] args) {
        String name = "Bier";
        float bierAlk = 0.05f;
        int bierGröße = 1000;
        float masse = berechneMasse(bierGröße,bierAlk);
        System.out.println("Die Alkoholmasse des Getränkes " + name +" beträgt: " + masse);
        float alkoholKonzentration = berechneAlkKonzentration(bierGröße,70,'m');
        if (alkoholKonzentration >= 0.5){
            System.out.println("Sie dürfen kein Auto mehr fahren!!!");
        }
        else if (alkoholKonzentration >= 0.3 && alkoholKonzentration < 0.5){
            System.out.println("Sie sollten kein Auto mehr fahren!!!");
        }
        else System.out.println("Sie können noch Auto fahren");
    }

    public static float berechneMasse(int volumenGetränk, float alkoholAnteil) {
        final float p = 0.8f;
        return (p * volumenGetränk * alkoholAnteil);
    }
    public static float berechneAlkKonzentration (int aufgenommeneMasse, float körpergewicht, char geschlecht) {
        float r = 0;
        if (aufgenommeneMasse == 0 && körpergewicht == 0 && geschlecht == '\0') {
            System.out.println("Sie nicht alle Werte eingegeben!");
            return -1f;
        } else {
            if (geschlecht == 'm') {
                r += 0.7f;
            } else if (geschlecht == 'f') {
                r += 0.6f;
            } else if (geschlecht == 'j') {
                r += 0.5;
            }
        }
        return ((körpergewicht * r) / aufgenommeneMasse);
    }
}
