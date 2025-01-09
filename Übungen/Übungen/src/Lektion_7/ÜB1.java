package Lektion_7;
import java.util.Scanner;

public class ÜB1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        System.out.println(getSinus(x));
    }

    public static double getSinus(double x) {
        double zaehler = x;
        double nenner = 1.0;
        double summe = x;
        double summand = x;

        for (int i = 3; summand > 1E-15 || summand < -1E-15; i = i + 2) {
            zaehler = zaehler * (-1) * x * x;
            nenner = nenner * (i - 1) * i;
            summand = zaehler / nenner;
            summe = summe + summand;
        }
        return summe;
    }
}
