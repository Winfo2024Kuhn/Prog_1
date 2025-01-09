package Altklausuren.Flasche;

public class MainFlasche {
    public static void main(String[] args) {
        Flasche f1 = new Flasche("Wolf", "Bacchus", 750);
        while (!f1.istLeer()) {
            f1.reduziereFuellstand(130);
        }
        System.out.println(f1);
    }
}
