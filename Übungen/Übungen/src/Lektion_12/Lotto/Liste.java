package Lektion_12.Lotto;

public class Liste {
    private Knoten start;

    public Liste(int lottozahlen) {
        start = new Knoten(1);
        Knoten current = start;
        for (int i = 1; i < lottozahlen; i++) {
            current.next = new Knoten(i + 1);
            current = current.next;
        }
    }

    private int[] entferneKnoten(int anzahlZiehungen) {

        int[] gezogeneZahlen = new int[anzahlZiehungen];

        for (int i = 0; i < anzahlZiehungen; i++ ) {
            Knoten current = start;
            Knoten prev = null;
            int listenLaenge = getLaenge();
            int randomNumber = (int) (Math.random() * listenLaenge);
            if (randomNumber == 0) {
                gezogeneZahlen[i] = start.zahl;
                start = start.next;
            } else {
                for (int j = 0; j < randomNumber; j++) {
                    prev = current;
                    current = current.next;
                }
                gezogeneZahlen[i] = current.zahl;
                prev.next = current.next;
            }
        }
        return gezogeneZahlen;
    }
    public void print(int anzahlZiehungen){
        int[] tempZahlen = entferneKnoten(anzahlZiehungen);
        tempZahlen = zahlenSortieren(tempZahlen);
        System.out.println("Die gezogenen Zahlen sind: ");
        for (int i = 0; i < tempZahlen.length; i++){
            System.out.print(tempZahlen[i] + " ");
        }
    }

    private int getLaenge() {
        Knoten current = start;
        int counter = 0;
        while (current != null) {
            counter++;
            current = current.next;
        }
        return counter;
    }
    private int[] zahlenSortieren(int[] in){
        int temp;
        boolean sorted;
        do{
            sorted = true;
            for (int i = 0; i< in.length-1; i++) {
                temp = in[i];
                if (temp > in[i+1]) {
                    sorted = false;
                    in[i] = in[i+1];
                    in[i+1] = temp;
                }
            }
        } while (!sorted);
        return in;
    }
}
