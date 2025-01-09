package Lektion_4;
import java.util.Scanner;

public class L4_ÜB1_Countdown_b {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie eine Zahl ein bei dem der Countdown starten soll");
        int eingabe = scanner.nextInt();
        for (int i = eingabe; i >= 0; i--){
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
}
