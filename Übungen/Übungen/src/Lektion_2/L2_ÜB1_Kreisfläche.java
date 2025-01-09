package Lektion_2;

public class L2_ÜB1_Kreisfläche {
    public static void main(String[] args) {

        double Radius = 56.8;
        double Kreisfläche = ((Radius*Radius)*Math.PI);
        double Kreisumfang = ((Radius*2)*Math.PI);
        double VolumenKugel =  ((4.0/3.0)*(Radius*Radius*Radius)*Math.PI);

        System.out.println("Die Kreisfläche der Radius " + Radius + " = " + Kreisfläche);
        System.out.println("Die Kreisumfang der Radius " + Radius + " = " + Kreisumfang);
        System.out.println("Die VolumenKugel der Radius " + Radius + " = " + VolumenKugel);
    }
}