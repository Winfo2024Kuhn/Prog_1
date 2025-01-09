package Lektion_7;

import java.util.Random;

public class ÜB5 {
    public static void main(String[] args) {
        Random random = new Random();
        int runs = 1000000;
        int numberOfCoins = 0;
        int numberOfNoCoins = 0;

        for (int i = 0; i < runs; i++) {
            //Boolean, da 50 % Wahrscheinlichkeit
            boolean probabilityDesk = random.nextBoolean();
            if (probabilityDesk) {
                //3 Schubladen
                int probabilityDrawer = random.nextInt(3) + 1;
                if (probabilityDrawer == 3) {
                    numberOfCoins++;
                } else numberOfNoCoins++;
            } else numberOfNoCoins++;
        }
        double probability = (double) numberOfCoins / numberOfNoCoins;
        System.out.println("Die Wahrscheinlichkeit beträgt " + probability);
    }
}