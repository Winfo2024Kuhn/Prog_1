package Altklausuren.Geschenke;

public class Weihnachtsbaum {
    static Geschenk [] geschenke = new Geschenk[3];
    public static void main(String[] args){
        geschenke[0] = new Geschenk("Elena", "Marvin",500,"Schreibtisch");
        geschenke[1] = new Geschenk("Marvin", "Elena", 80,"Thermengutschein");
        geschenke[2] = new Geschenk("Hildegund", "Marvin",100,"Geld");
        geschenke[0].auspacken("Marvin");
        System.out.print(geschenke[0]);
    }
}
