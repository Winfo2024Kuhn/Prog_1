package Altklausuren.Stack;

public class Stack {
    Knoten oben;

    public Stack() {
        this.oben = null;
    }

    public void push(TShirt in) {
        Knoten neu = new Knoten(in);
        if (isEmpty()) {
            this.oben = neu;
        } else {
            Knoten temp = this.oben;
            this.oben = neu;
            this.oben.vorgaenger = temp;
            temp.nachfolger = this.oben;
        }
    }

    public TShirt pop() {
        if (!isEmpty()) {
            TShirt tShirt = this.oben.tShirt;
            this.oben = this.oben.vorgaenger;
            if (this.oben != null) {
                this.oben.nachfolger = null;
            }
            System.out.println("removed: " + tShirt.toString());
            return tShirt;
        }
        return null;
    }

    public boolean isEmpty() {
        return this.oben == null;
    }

    public String retrieveContent() {
        String s = "";
        if (!isEmpty()) {
            Knoten temp = this.oben;
            while (temp.vorgaenger != null){
                temp = temp.vorgaenger;
            }
            while (temp != null) {
                s += temp.tShirt.toString();
                temp = temp.nachfolger;
            }
        }
        else return "Es sind keine T-Shirts auf dem Stapel...";
        return s;
    }

    public static void main(String[] args) {
        TShirt tshirtBlau = new TShirt("blau", "unknown");
        TShirt tshirtRot = new TShirt("rot", "unknown");
        TShirt tshirtGruen = new TShirt("grün", "unknown");

        Stack stack = new Stack();
        stack.push(tshirtBlau);
        stack.push(tshirtRot);
        stack.push(tshirtGruen);

        stack.pop();

        System.out.println(stack.retrieveContent());
    }
}

