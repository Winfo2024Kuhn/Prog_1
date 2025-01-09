package Altklausuren.Mannschaftsbaum;

public class Baum {
    Knoten root;

    public Baum() {
        root = null;
    }

    public void einfuegen(Mannschaft mannschaft) {
        Knoten neu = new Knoten(mannschaft);
        if (root == null) {
            this.root = neu;
        } else {
            einfuegen(root, neu);
        }
    }

    private void einfuegen(Knoten temp, Knoten neu) {
        if (temp.getName().compareTo(neu.getName()) < 0) {
            if (temp.links == null) {
                temp.links = neu;
            } else einfuegen(temp.links, neu);
        } else if (temp.getName().compareTo(neu.getName()) > 0) {
            if (temp.rechts == null) {
                temp.rechts = neu;
            } else einfuegen(temp.rechts, neu);
        }
    }

    public Mannschaft maxTore() {
        if (root == null) {
            return null; // Baum ist leer
        }
        return maxTore(root);
    }

    private Mannschaft maxTore(Knoten temp) {
        if (temp == null) {
            return null;
        }

        Mannschaft linksMax = maxTore(temp.links); // Maximum im linken Teilbaum
        Mannschaft rechtsMax = maxTore(temp.rechts); // Maximum im rechten Teilbaum

        // Manuelles Maximum berechnen
        Mannschaft max = temp.getMannschaft();
        if (linksMax != null && linksMax.getTore() > max.getTore()) {
            max = linksMax;
        }
        if (rechtsMax != null && rechtsMax.getTore() > max.getTore()) {
            max = rechtsMax;
        }

        return max;
    }
}
