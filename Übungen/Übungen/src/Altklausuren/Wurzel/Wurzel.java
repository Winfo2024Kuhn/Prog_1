package Altklausuren.Wurzel;

public class Wurzel {
public static double berechneWurzel(double in){
    if (in > 0) {
        double yi = 1;
        for (int i = 0; i < 100; i++) {
            yi = (yi + in / yi) / 2;
        }
        return yi;
    }
    else return -1;
}
    public static void main(String[] args){
        System.out.println(berechneWurzel(78));
    }
}
