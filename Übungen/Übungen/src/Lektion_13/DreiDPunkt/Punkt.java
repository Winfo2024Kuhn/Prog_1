package Lektion_13.DreiDPunkt;

public class Punkt {
    private int x,y,z;

    public Punkt (int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double berechneAbstand() {
        return berechneWurzel(x * x + y * y + z * z);
    }

    public double berechneWurzel(double in) {
        if (in >= 0) {
            double yi = 1;
            for (int i = 0; i < 100; i++) {
                yi = (yi + in / yi) / 2;
            }
            return yi;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "a=" + x + ", b=" + y + ", c=" + z;
    }
    public static void main (String[] args){
        Punkt p = new Punkt(2,5,7);
        System.out.println(p);
        System.out.println("Der Abstand ist: " + p.berechneAbstand());
    }
}
