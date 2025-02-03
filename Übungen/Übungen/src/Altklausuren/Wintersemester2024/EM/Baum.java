package Altklausuren.Wintersemester2024.EM;

public class Baum {
    Knoten root;

    public Baum(Knoten in) {
        root = in;
    }

    public void einfuegen(Knoten in) {
        if (root == null) {
            root = in;
        } else {
            einfuegen(root, in);
        }
    }

    private void einfuegen(Knoten temp, Knoten in) {
        int vergleich = temp.mannschaft.getName().compareTo(in.mannschaft.getName());
        if (vergleich < 0) {
            if (temp.left == null) {
                temp.left = in;
            } else {
                einfuegen(temp.left, in);
            }
        } else {
            if (temp.right == null) {
                temp.right = in;
            } else {
                einfuegen(temp.right, in);
            }
        }
    }

    public Mannschaft getMaxTore() {
        if (root == null) {
            return null;
        } else return getMaxTore(root, root);
    }

    private Mannschaft getMaxTore(Knoten temp, Knoten tempMaxTore) {
        if (temp != null) {

            if (temp.mannschaft.tore > tempMaxTore.mannschaft.tore) {
                tempMaxTore = temp;
            }
            tempMaxTore = new Knoten(getMaxTore(temp.left, tempMaxTore));
            tempMaxTore = new Knoten(getMaxTore(temp.right, tempMaxTore));

        }
        return tempMaxTore.mannschaft;
    }

    public static void main(String[] args) {
        Mannschaft[] em = new Mannschaft[4];
        Mannschaft root = new Mannschaft("Serbien", 3);
        Knoten neu = new Knoten(root);
        em[0] = new Mannschaft("Spanien", 0);
        em[1] = new Mannschaft("Deutschland", 400);
        em[2] = new Mannschaft("Italien", 6);
        em[3] = new Mannschaft("England", 1);
        Baum em2 = new Baum(neu);

        for (int i = 0; i < em.length; i++) {
            Knoten k = new Knoten(em[i]);
            em2.einfuegen(k);
        }
        System.out.println("Die Mannschaft mit den meisten Toren ist: " + em2.getMaxTore().getName() + " mit " + em2.getMaxTore().tore + " Toren.");

    }
}
