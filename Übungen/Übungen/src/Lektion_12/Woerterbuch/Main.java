package Lektion_12.Woerterbuch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Baum baum = new Baum();

        while (true) {
            Wort w;
            Knoten k;

            System.out.println("\nWenn Sie ein neues Wort hinzufügen wollen, dann geben Sie die 1 ein.");
            System.out.println("Wenn Sie ein Wort im Wörterbuch suchen wollen, dann geben Sie die 2 ein.");
            System.out.println("Wollen Sie das Programm beenden, dann geben Sie die 3 ein.");
            System.out.print("Eingabe: ");
            String input = s.nextLine();

            if (input.charAt(0) == '1') {
                System.out.print("\nGeben Sie den Namen des neuen Wortes ein: ");
                String name = s.nextLine();
                System.out.print("Geben Sie die Bedeutung des neuen Wortes ein: ");
                String bedeutung = s.nextLine();
                System.out.println();
                w = new Wort(name, bedeutung);
                k = new Knoten(w);
                baum.insert(k);
                baum.print();
            } else if (input.charAt(0) == '2') {
                if (!baum.isEmpty()) {
                    System.out.print("Geben Sie das zu suchende Wort ein: ");
                    String name = s.nextLine();
                    w = new Wort(name, "");
                    System.out.println(baum.search(w));
                }
                else System.out.println("Das Wörterbuch ist leer");
            } else break;
        }
    }
}
