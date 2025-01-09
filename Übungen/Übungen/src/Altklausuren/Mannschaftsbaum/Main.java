package Altklausuren.Mannschaftsbaum;

public class Main {
    public static void main(String[] args) {
        Mannschaft[] emMannschaften = new Mannschaft[3];
        emMannschaften[0] = new Mannschaft("Spanien");
        emMannschaften[1] = new Mannschaft("Deutschland");
        emMannschaften[2] = new Mannschaft("England");

        emMannschaften[0].setTore(4);
        emMannschaften[1].setTore(100);
        emMannschaften[2].setTore(2);

        Baum teams = new Baum();

        for (int i = 0; i < emMannschaften.length; i++) {
            teams.einfuegen(emMannschaften[i]);
        }
        Mannschaft maxTore = teams.maxTore();
        System.out.print("Die Mannschaft mit den meisten Toren ist: " + maxTore.getName() + " mit " + maxTore.getTore() + " Toren");
    }
}
