package Altklausuren.SozialesNetzwerk;

public class Post {
    public String text;
    public String absender;
    public String empfaenger;
    public Post next;

    public Post(String text, String absender, String empfaenger) {
        this.text = text;
        this.absender = absender;
        this.empfaenger = empfaenger;
    }
    @Override
    public String toString(){
        return absender + " -> " + empfaenger + "\n" + text + "\n\n";
    }
}
