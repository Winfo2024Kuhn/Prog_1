package Lektion_12.ÜB1_Lottospiel;

public class MainLottoziehung {
    public static void main(String[] args) {
        VerketteteListe liste = new VerketteteListe();
        liste.entferneZufälligeZahl(5);
        System.out.println(liste.toString());
    }
}
