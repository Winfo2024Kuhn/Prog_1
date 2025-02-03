package Altklausuren.Mannschaftsbaum;

public class Baum {
    Knoten root;

    public Baum(Mannschaft in) {
        root = new Knoten(in);
    }

    public void einfuegen(Mannschaft in) {
        Knoten neu = new Knoten(in);
        einfuegen(neu, root);
    }

    private void einfuegen(Knoten in, Knoten temp) {

        if (temp.team.getName().compareTo(in.team.getName()) > 0) {
            if (temp.left == null) {
                temp.left = in;
            } else {
                einfuegen(in, temp.left);
            }
        } else {
            if (temp.right == null) {
                temp.right = in;
            } else {
                einfuegen(in, temp.right);
            }
        }
    }

    public Mannschaft maxTore() {
        return maxTore(root, root.team);
    }

    private Mannschaft maxTore(Knoten temp, Mannschaft currentMax) {
        if (temp == null) {
            return currentMax;
        }
        // Vergleiche das aktuelle Team mit dem bisherigen Maximum
        if (temp.team.getTore() > currentMax.getTore()) {
            currentMax = temp.team;
        }
        // Rekursiv den linken und rechten Teilbaum durchsuchen und Maximum zurückgeben
        currentMax = maxTore(temp.left, currentMax);
        currentMax = maxTore(temp.right, currentMax);
        return currentMax;
    }
    public Mannschaft besteTorDifferenz(){
        return besteTorDifferenz(root,root.team);
    }
    private Mannschaft besteTorDifferenz(Knoten temp, Mannschaft currentBest){
        if (temp == null){
            return currentBest;
        }
        if (temp.team.getTore()-temp.team.getGegentore() > currentBest.getTore()-currentBest.getGegentore()){
            currentBest = temp.team;
        }
        currentBest = besteTorDifferenz(temp.left,currentBest);
        currentBest = besteTorDifferenz(temp.right,currentBest);
        return currentBest;
    }

    public void print() {
        Knoten temp = root;
        print(temp);
    }

    private void print(Knoten temp) {
        if (temp != null) {
            print(temp.left);
            System.out.println(temp.team);
            print(temp.right);
        }
    }

    public static void main(String[] args) {
        Mannschaft[] teams = new Mannschaft[10];
        teams[0] = new Mannschaft("Deutschland");
        teams[1] = new Mannschaft("Spanien");
        teams[2] = new Mannschaft("England");
        teams[3] = new Mannschaft("Italien");
        teams[4] = new Mannschaft("Finnland");
        teams[5] = new Mannschaft("Ungarn");
        teams[6] = new Mannschaft("Belgien");
        teams[7] = new Mannschaft("Frankreich");
        teams[8] = new Mannschaft("Schweden");
        teams[9] = new Mannschaft("Polen");
        Baum b = new Baum(teams[0]);

        for (int j = 0; j < teams.length; j++){
            teams[j].setTore((int) (Math.random()* 50));
            teams[j].setGegentore((int)(Math.random()*20));
        }

        for (int i = 1; i < teams.length; i++) {
            b.einfuegen(teams[i]);
        }
        b.print();
        System.out.println("Die Mannschaft mit den meisten Toren ist: " + b.maxTore());
        System.out.println("Die Mannschaft mit der besten Tordifferenz ist: " + b.besteTorDifferenz());

    }
}
