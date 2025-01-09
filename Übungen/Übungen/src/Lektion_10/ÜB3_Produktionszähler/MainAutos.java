package Lektion_10.ÜB3_Produktionszähler;

public class MainAutos {
    public static void main(String[] args) {

        AutoFabrik Hessen = new AutoFabrik();

        Hessen.produziere("Seat",1500,190,"Gelb");
        Hessen.produziere("A8", 3400, 550, "Schwarz");
    }
}
