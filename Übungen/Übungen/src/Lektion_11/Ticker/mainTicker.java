package Lektion_11.Ticker;
import java.util.Scanner;

public class mainTicker {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Puffergröße eingeben: ");
        String pufferGroesse = s.nextLine();
        Ticker N24 = new Ticker(Integer.valueOf(pufferGroesse));
        System.out.println("Text eingeben: ");
        String text = s.nextLine();
        char[] toText = text.toCharArray();
        N24.setNachricht(toText);
        N24.rotateNachricht(6);
        N24.print();
    }
}
