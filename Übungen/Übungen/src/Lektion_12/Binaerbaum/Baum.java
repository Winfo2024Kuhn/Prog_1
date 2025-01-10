package Lektion_12.Binaerbaum;

public class Baum {
    private Knoten root;

    public Baum() {
        this.root = null;
    }

    public void insert(Knoten k) {
        if (root == null) {
            root = k;
        } else insert(root, k);
    }

    private void insert(Knoten temp, Knoten k) {
        if (temp.wort.wort.compareTo(k.wort.wort) > 0) {
            if (temp.left == null) {
                temp.left = k;
            } else insert(temp.left, k);
        } else {
            if (temp.right == null) {
                temp.right = k;
            } else insert(temp.right, k);
        }
    }

    public void print() {
        if (!isEmpty()) {
            print(root);
        }
    }

    private void print(Knoten temp) {
        if (temp != null) {
            print(temp.left);
            System.out.print(temp.wort.toString());
            print(temp.right);
        }

    }

    public String search(Wort w) {
        if (isEmpty()) {
            return null;
        }
        return search(root, w);
    }

    private String search(Knoten temp, Wort w) {
        if (temp == null) {
            return null;
        }
        if (temp.wort.wort.equals(w.wort)) {
            return temp.wort.bedeutung;
        }
        if (w.wort.compareTo(temp.wort.wort) < 0) {
            return search(temp.left, w);
        } else {
            return search(temp.right, w);
        }
    }

    private boolean isEmpty() {
        if (root == null){
            System.out.println("Das Wörterbuch ist leer!");
            return true;
        }
        else return false;
    }

    public void deleteKnoten(Wort w) {
        if (isEmpty()) {
            return;
        }
        // Wir aktualisieren root entsprechend
        root = deleteKnoten(root, w);
    }

    // Reine Hilfsmethode
    private Knoten deleteKnoten(Knoten temp, Wort w) {
        if (temp == null) {
            // Nichts zu löschen
            return null;
        }

        int vergleich = w.wort.compareTo(temp.wort.wort);

        if (vergleich < 0) {
            temp.left = deleteKnoten(temp.left, w);
        } else if (vergleich > 0) {
            temp.right = deleteKnoten(temp.right, w);
        } else {
            // Wir haben den zu löschenden Knoten gefunden
            // Fall A: keine Kinder
            if (temp.left == null && temp.right == null) {
                return null;
            }
            // Fall B: genau ein Kind
            if (temp.left == null) {
                return temp.right;
            } else if (temp.right == null) {
                return temp.left;
            }
            // Fall C: zwei Kinder
            // kleinster Knoten im rechten Teilbaum
            Knoten minNode = findMin(temp.right);
            // Kopiere das Wort
            temp.wort = minNode.wort;
            // Lösche diesen minNode aus dem rechten Teilbaum
            temp.right = deleteKnoten(temp.right, minNode.wort);
        }
        return temp;
    }

    // Minimum im Teilbaum finden:
    private Knoten findMin(Knoten node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

}