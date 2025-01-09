package Lektion_3;

public class L3_ÜB4_Würfelwurf {
    public static void main(String[] args) {

        // Zufällige Zahl zwischen 1 und 6 erzeugen
        //Math.random Ergebnis = gibt (0.0 - 0.99) Double, deshalb * (6) = 0 - 5 + 1, da 1-6!!
        int würfel = (int)(Math.random() * 7) + 1;

        switch (würfel) {
            case 1:
                System.out.println("Sie haben eine 1 gewürfelt.");
                break;
            case 2:
                System.out.println("Sie haben eine 2 gewürfelt.");
                break;
            case 3:
                System.out.println("Sie haben eine 3 gewürfelt.");
                break;
            case 4:
                System.out.println("Sie haben eine 4 gewürfelt.");
                break;
            case 5:
                System.out.println("Sie haben eine 5 gewürfelt.");
                break;
            case 6:
                System.out.println("Sie haben eine 6 gewürfelt.");
                break;
        }
    }
}

