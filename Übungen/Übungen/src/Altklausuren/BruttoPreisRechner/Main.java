package Altklausuren.BruttoPreisRechner;

public class Main {
    public static void main(String[] args){
        double brutto = 1.07;
        double mwSt = 0.07;
        System.out.printf("%-1.2f€", berechneNettopreis(brutto,mwSt));
    }
    public static double berechneNettopreis(double brutto, double mwSt){
        return (brutto/(mwSt+1));
    }
}
