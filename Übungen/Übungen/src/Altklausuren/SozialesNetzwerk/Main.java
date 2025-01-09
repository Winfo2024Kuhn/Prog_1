package Altklausuren.SozialesNetzwerk;

public class Main {
    public static void main(String[] args){
        Timeline Whatsapp = new Timeline();
        Post[] nachrichten = new Post[3];
        nachrichten[0] = new Post("Was machen Sachen?", "Maria", "Josef");
        nachrichten[1] = new Post("Was laberscht du?", "Paula", "Haiko");
        nachrichten[2] = new Post("Was für Timeline alter?", "Sandra", "Günter");

        for (int i = 0; i < nachrichten.length; i++){
            Whatsapp.fuegePostEin(nachrichten[i]);
        }
        System.out.println(Whatsapp.gibAus());
    }
}
