package Altklausuren.SozialesNetzwerk;

public class Post {
    String text;
    String absender;
    String empfaenger;
    Post next;

    public Post(String text, String absender, String empfaenger){
        this.text = text;
        this.absender = absender;
        this.empfaenger = empfaenger;
    }
}
