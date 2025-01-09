package Lektion_1;

public class L1_ÜB5_Variablen_tauschen {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        //Vor dem Tausch
        System.out.println("x hatte vorher den Wert " + x);
        System.out.println("y hatte vorher den Wert " + y);
        //Tausch
        int temp = x;
        x = y;
        y = temp;
        //Nach dem Tausch
        System.out.println("x hat jetzt den Wert " + x);
        System.out.println("y hat jetzt den Wert "+ y);
    }
}

