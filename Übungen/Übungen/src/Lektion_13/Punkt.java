package Lektion_13;

public class Punkt {
    int x;
    int y;
    int z;
    String name;

    public Punkt(String name, int x, int y, int z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void berechneAbstand() {
        double d = x * x + y * y + z * z;
        System.out.println(getSqrt(d));
    }

    public static double getSqrt(double input) {
        double result = 1;
        for (int i = 1; i <= 1000; i++) {
            result = ((input / result) + result) / 2;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Punkt: " + name + " x=" + x + ", y=" + y + " z=" + z;
    }

    public static void main(String[] args) {
        Punkt p = new Punkt("Punkt P", 250, 456, 89);
        p.berechneAbstand();
        System.out.print(p.toString());
    }
}

