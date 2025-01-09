package Lektion_12.ÜB1_Lottospiel;

class VerketteteListe {
    Knoten start;

    // Liste mit Zahlen von 1 bis 49 erstellen
    public VerketteteListe() {
        this.start = new Knoten(1);
        Knoten current = this.start;

        for (int i = 2; i <= 49; i++) {
            current.next = new Knoten(i);
            current = current.next;
        }
    }

    // Zufällige Zahl entfernen und zurückgeben
    public void entferneZufälligeZahl(int anzahl) {
        Knoten current;
        Knoten previous;
        int[] gezogeneZahlen = new int[anzahl];

        for (int i = 0; i < anzahl; i++) {
            int ListenIndex = 0;
            int randomKnoten = (int) (Math.random() * getLaenge());
            current = start;
            previous = null;

            while (ListenIndex < randomKnoten) {
                previous = current;
                current = current.next;
                ListenIndex++;
            }
            if (previous == null) {
                gezogeneZahlen[i] = current.getValue();
                start = start.next;
            } else {
                gezogeneZahlen[i] = current.getValue();
                previous.next = current.next;
            }
        }
        sortiereArray(gezogeneZahlen);
        for (int i = 0;i < gezogeneZahlen.length; i++) {
            System.out.println("Zahl " + (i + 1) + ": " + gezogeneZahlen[i]);
        }
    }


    // Länge der Liste berechnen
    public int getLaenge() {
        int laenge = 0;
        Knoten temp = start;
        while (temp != null) {
            laenge++;
            temp = temp.next;
        }
        return laenge;
    }

    private int[] sortiereArray(int[] a) {
        boolean sortiert;
        do {
            sortiert = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int newTemp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = newTemp;
                    sortiert = false;
                }
            }
        } while (!sortiert);
        return a;
    }

    public boolean isEmpty() {
        return this.start == null;
    }

    public String toString() {
        if (!isEmpty()) {
            String s = "";
            Knoten current = this.start;
            int counter = 1;
            while (current != null) {
                if (current.next != null) {
                    if (counter % 20 == 0) {
                        s += current.getValue() + "\n";
                    } else s += current.getValue() + " -> ";
                } else {
                    s += current.getValue();
                }
                current = current.next;
                counter++;
            }
            return s;
        } else return "Die Liste ist leer...";
    }
}
