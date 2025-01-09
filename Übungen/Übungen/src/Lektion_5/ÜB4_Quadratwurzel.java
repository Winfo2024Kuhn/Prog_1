package Lektion_5;

import java.util.Scanner;

public class ÜB4_Quadratwurzel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie ihre Zahl ein:");
        double x = scanner.nextDouble();
        System.out.println(getSqrt(x));
    }
    public static double getSqrt(double input){
        double result = 1;
        for (int i = 1; i <= 1000; i++){
            result = ((input/result)+result)/2;
        }
        return result;
    }
}
