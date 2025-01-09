package Lektion_4;

public class L4_ÜB6_DasKleineEinMalEins {
    public static void main(String[] args){

        System.out.println("Ausgabe: ");
        System.out.println("");

        for (int faktor1 = 1; faktor1 <= 10; faktor1++){
            for (int faktor2 = 1; faktor2 <= 10; faktor2++){
                int produkt = faktor1 * faktor2;
                System.out.println(faktor1 + " x " + faktor2 + " = " + produkt);
            }
            System.out.println("");
        }
    }
}

