package Altklausuren.Polynom;

public class Polynom3 {
    public static void main(String[] args) {
        double[] zahlen = {-8, 1.3, 4, 1.5};
        Polynom3 test = new Polynom3(3, zahlen);
        System.out.println(test.toString());

    }

    int nGrad;
    double[] variablen;

    public Polynom3(int nGrad, double[] variablen) {
        this.nGrad = nGrad;
        this.variablen = variablen;
    }

    public double berechneAnDerStelleX(int x) {
        double ergebnis = 0;
        for (int i = 0; i < variablen.length; i++) {
            ergebnis += variablen[i] * pow(x, variablen.length - i);
        }
        return ergebnis;
    }


    public double pow(double basis, int exponent) {
        if (exponent <= 0) {
            return 1;
        }
        return basis * pow(basis, exponent - 1);
    }

    @Override
    public String toString() {
        String s = "";
        int temp = 0;
        for (int i = 0; i < variablen.length; i++) {
            if (i < variablen.length - 3) {
                s += variablen[i] + "x^" + (nGrad - i) + " + ";
            } else if (i < variablen.length - 1) {
                s += variablen[i] + "x" + " + ";
            }
            else s += variablen[i];
        }
        return s;
    }
}




