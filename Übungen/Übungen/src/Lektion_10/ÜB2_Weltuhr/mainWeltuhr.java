package Lektion_10.ÜB2_Weltuhr;

public class mainWeltuhr {
    public static void main(String[] args) {

        Weltuhr[] Weltuhren = new Weltuhr[24];
        for (int i = 0; i < Weltuhren.length; i++) {
            Weltuhren[i] = new Weltuhr(7, 23, i);
        }

        for (int i = 0; i < Weltuhren.length; i++) {
            Weltuhren[i].nächsteSek();
            System.out.println(Weltuhren[i].stunden + ":" + Weltuhren[i].minuten + ":" + Weltuhren[i].sekunden + " Uhr");
        }
    }
}
