package Lektion_12.Binaerbaum;

public class Baum {
    private Knoten root;

    public Baum() {
        this.root = null;
    }

    public void insert(Knoten k) {
        if (isEmpty()) {
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
        return root == null;
    }

}