package Altklausuren.Wintersemester2024;

public class Messlöffel {
    public static double getRadius (double volumen){
        return Math.pow(volumen/Math.PI,1.0/3);
    }
    public static void main (String[] args){
        double volumenInMl = 1;
        double radius = getRadius(volumenInMl);
        System.out.println("Volumen: " + volumenInMl + "cm^3, Radius: " + radius + "cm");
    }
}
