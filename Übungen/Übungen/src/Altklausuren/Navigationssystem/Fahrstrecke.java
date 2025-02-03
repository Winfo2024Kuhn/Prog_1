package Altklausuren.Navigationssystem;

public class Fahrstrecke {
    Zielort start;


    public void einfuegen(Zielort in) {
        Zielort temp = start;
        if (start == null) {
            start = in;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = in;
        }
    }

    public int gesamtStrecke() {
        Zielort temp = start;
        int counter = 0;
        if (start != null) {
            while (temp != null) {
                counter += temp.getDistanz();
                temp = temp.next;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Zielort[] route = new Zielort[4];
        route[0] = new Zielort("Würzburg", 0);
        route[1] = new Zielort("Kitzigen", 19);
        route[2] = new Zielort("Neustadt", 42);
        route[3] = new Zielort("Nürnberg", 49);

        Fahrstrecke x = new Fahrstrecke();
        String s = "";
        for (int i = 0; i < route.length; i++) {
            x.einfuegen(route[i]);
            s += route[i].toString();
            s += " -> ";
        }
        int y = x.gesamtStrecke();
        System.out.println("Die Gesamtstrecke der Route " + s + " = " + y);
    }
}

