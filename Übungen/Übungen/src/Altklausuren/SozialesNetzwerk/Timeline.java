package Altklausuren.SozialesNetzwerk;

public class Timeline {
    Post neu;

    public Timeline() {
        this.neu = neu;
    }
     public boolean isEmpty(){
        return neu == null;
     }
     public void fuegePostEin(Post in){
        if (isEmpty()){
            neu = in;
        }
        else {
            in.next = neu;
            neu = in;
        }
     }
     public void gibAus(){
        Post temp = neu;
        while (temp != null){
            System.out.print(temp);
            temp = temp.next;
        }
     }

     public static void main (String [] args){
        Timeline t = new Timeline();
        Post[] p = new Post[3];
        p[0] = new Post("Gutes neues Jahr!", "Alice", "Bob");
        p[1] = new Post("Danke! Guten Rutsch ins neue Jahr!", "Bob", "Alice");
        p[2] = new Post("Frohe Weihnachten!", "Alice", "Bob");
        for (int i = 0; i< p.length; i++){
            t.fuegePostEin(p[i]);
        }
        t.gibAus();
     }
}
