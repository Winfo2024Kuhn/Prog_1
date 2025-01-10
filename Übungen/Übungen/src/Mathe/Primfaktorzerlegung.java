package Mathe;

public class Primfaktorzerlegung {
    public int[] getPrimzahlen(int in){
        if (in <= 1){
            System.out.println("Die Eingabe muss größer 1 sein!");
            return null;
        }
        // X= maximales Vielfaches
        int x = (int)(getSquareRoot(in)) + 1;
        int a = 0;
        int b = 0;
        for (int i = 1; i < x; i++){
            if ((in/i)%10 == 0){
                a += i;
                b += in/a;
                break;
            }
        }return new int[]{a, b};
    }
    public double getSquareRoot(int in){
        if (in == 0){
            System.out.println("Die Wurzel von 0 ist nicht definiert");
            return -1;
        }
        double ergebnis = 1;
        for (int i = 0; i< 10000; i++){
            ergebnis = ((in/ergebnis)+ergebnis)/2;
        }
        return ergebnis;
    }
}
