package Tutorium.Zoo;

public class Zoo {
    Tiere root;

    public Zoo() {
        this.root = null;
    }

    public void einfuegen(Tiere neu) {
        if (root == null) {
            root = neu;
        } else {
            einfuegen(root, neu);
        }
    }

    private void einfuegen(Tiere temp, Tiere neu) {
        boolean vergleich = temp.groesse - neu.groesse < 0;
        if (!vergleich) {
            if (temp.left != null) {
                einfuegen(temp.left, neu);
            } else {
                temp.left = neu;
            }
        } else {
            if (temp.right != null) {
                einfuegen(temp.right, neu);
            } else {
                temp.right = neu;
            }
        }
    }

    public void printInOrder() {
        if (root == null) {
            System.out.print("Dein Baum ist leer Diggah!!");
        } else printInOrder(root);
    }

    private void printInOrder(Tiere temp) {
        if (temp != null) {
            printInOrder(temp.right);
            System.out.print(temp.toString());
            printInOrder(temp.left);

        }
    }

    public static void main(String[] args) {
        Tiere[] meineTiere = new Tiere[10];
        meineTiere[0] = new Tiere("Esel", 120);
        meineTiere[1] = new Tiere("Tiger", 90);
        meineTiere[2] = new Tiere("Bär", 210);
        meineTiere[3] = new Tiere("Wildschwein", 80);
        meineTiere[4] = new Tiere("Eisbär", 200);
        meineTiere[5] = new Tiere("Maultier", 20);
        meineTiere[6] = new Tiere("Löwe", 70);
        meineTiere[7] = new Tiere("Schlange", 20);
        meineTiere[8] = new Tiere("Scorpion", 5);
        meineTiere[9] = new Tiere("Schnecke", 4);
        Zoo wuerzburg = new Zoo();
        for (int i = 0; i < meineTiere.length; i++) {
            wuerzburg.einfuegen(meineTiere[i]);
        }
        wuerzburg.printInOrder();

    }
}

