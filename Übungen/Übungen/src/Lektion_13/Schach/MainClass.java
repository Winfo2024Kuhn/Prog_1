package Lektion_13.Schach;

public class MainClass {
    public static void main(String[] args) {

        String s;
        Schachbrett Holz = new Schachbrett();

        Holz.setzeTurm(3, 5);
        s = Holz.toString();
        System.out.println(s);
    }
}
