package Altklausuren.Navigationssystem;

public class Fahrstrecke {
    Zielort start;

    public Fahrstrecke() {
        this.start = null;
    }

    public void einfuegen(Zielort neu) {
        Zielort temp = start;
        if (start == null) {
            start = neu;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = neu;
        }
    }

    public int gesamtStrecke() {
        int counter = 0;
        Zielort temp = start;
        if (!istLeer()) {
            while (temp != null) {
                counter += temp.getDistanz();
                temp = temp.next;
            }
        }
        return counter;
    }

    private boolean istLeer() {
        if (start == null){
            System.out.println("Die Liste ist leer!");
            return true;
        }
        else return false;
    }
    public static void main(String[] args){
        Fahrstrecke route = new Fahrstrecke();
        Zielort[] ziele = new Zielort[4];
        ziele[0] = new Zielort("Würzbrug", 0);
        ziele[1] = new Zielort("Kitzingen",19);
        ziele[2] = new Zielort("Neustadt",42);
        ziele[3] = new Zielort("Nürnberg",49);
        for (int i = 0; i < ziele.length; i++){
            route.einfuegen(ziele[i]);
        }
        String s = "";
        for (int i = 0; i < ziele.length; i++){
            if (i < ziele.length-1) {
                s += ziele[i].toString();
                s+= " -> ";
            }
            else s+= ziele[i].toString();
        }
        System.out.println(s);
        System.out.println("Die Gesamtstrecke ist: " + route.gesamtStrecke());
    }
}
