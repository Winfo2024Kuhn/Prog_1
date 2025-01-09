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
        if (temp.wort.compareTo(k.wort) < 0) {
            if (temp.left == null){
                temp.left = k;
            }
            else insert(temp.left,k);
        }
        else {
            if (temp.right == null){
                temp.right = k;
            }
            else insert(temp.right,k);
        }
    }
    public void print(){

    }
}
