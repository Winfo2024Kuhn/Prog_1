package Lektion_12.Woerterbuch;

public class Baum {
    Knoten root;

    public Baum() {
        root = null;
    }

    public void insert(Knoten k) {
        if (!isEmpty()) {
            insert(root, k);
        } else root = k;
    }

    private void insert(Knoten current, Knoten k) {
        if (current.getWort().getName().compareTo(k.getWort().getName()) > 0) {
           if (current.left == null){
               current.left = k;
           }
           else insert(current.left,k);
        }
        else {
            if(current.right == null){
                current.right = k;
            }
            else insert(current.right,k);
        }
    }
    public void print(){
        if (!isEmpty()){
            print(root);
        }
    }
    private void print(Knoten k){
        if (k != null) {
            print(k.left);
            System.out.println(k.getWort().toString());
            print(k.right);
        }
    }
    public String search(Wort w){
        if (!isEmpty()){
            return search(root,w);
        }
        else return "Das Wörterbuch ist leer";
    }
    private String search(Knoten current,Wort w){
        if (current == null){
            return "Das Wort ist leider nicht enthalten";
        }
        int vergleichsParameter = current.getWort().getName().compareTo(w.getName());

        if (vergleichsParameter > 0){
            return search(current.left,w);
        }
        else if (vergleichsParameter < 0){
            return search(current.right,w);
        }
        else return "Die gesuchte Bedeutung ist: " + current.getWort().getBedeutung();
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else return false;
    }
}
