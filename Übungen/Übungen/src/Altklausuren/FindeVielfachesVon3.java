package Altklausuren;

public class FindeVielfachesVon3 {
    public static void main(String[] args) {
        int[] zahlen = {4, -5, 3, 9, -9, -12, 0};
        System.out.println(getVielfachesVon3(zahlen));
        System.out.println(getAltHarmReihe());
    }

    public static int getVielfachesVon3(int[] zahlen) {
        int counter = 0;
        for (int i = 0; i < zahlen.length; i++) {
            int current = zahlen[i];
            if (current % 3 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static double getAltHarmReihe(){
        double ergebnis = 0;
        int k = 1;
        for (int i = 1; i < 11; i++){
            for (int j = 0; j <= i; j++){
                k *= -1;
            }
            ergebnis += (double)k/i;
        }
        return ergebnis;
    }
}
