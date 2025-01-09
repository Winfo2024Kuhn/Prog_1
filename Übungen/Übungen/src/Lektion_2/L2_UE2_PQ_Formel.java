package Lektion_2;

public class L2_UE2_PQ_Formel {
    public static void main(String[] args) {
// PQ Formel Rechner
        double p = 10.0;
        double q = 6.9;
        double sqrt = Math.sqrt(((p/2)*(p/2))-q);
        double x1 = -(p/2)+sqrt;
        double x2 = -(p/2)-sqrt;
        System.out.println("Der Wert für x1 = " + x1);
        System.out.println("Der Wert für x2 = " + x2);
    }
}
