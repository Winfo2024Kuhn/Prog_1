package Lektion_3;
import java.util.Scanner;
public class L3_ÜB1_Modulo {
    public static void main(String[] args) {
        Scanner meineZahl = new Scanner(System.in);
        int operator = 7;
        System.out.println("Geben Sie bitte eine Ganzzahl ein.");
        int nummer = meineZahl.nextInt();
        int faktor = nummer/operator;
        if (nummer % operator == 0){

            System.out.println("Deine Zahl war komplett durch " + operator + " teilbar und geht " + faktor + " mal rein.");
        }

        else {
            System.out.println("Deine Zahl war nicht komplett durch " + operator + " teilbar, der Rest beträgt " + nummer % operator + ". ");
        }
    }
}
