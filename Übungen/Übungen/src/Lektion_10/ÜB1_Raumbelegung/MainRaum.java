package Lektion_10.ÜB1_Raumbelegung;

public class MainRaum {
    public static void main(String[] args) {
        Raum r1 = new Raum("I.2.1", 150);
        Raum r2 = new Raum("I.2.15", 5);

        Student s1 = new Student("Martina", 5060000);
        Student s2 = new Student("Steve", 5060030);
        Student s3 = new Student("Martin", 5067000);
        Student s4 = new Student("Marvin", 5060080);
        Student s5 = new Student("Sebastian", 5062300);
        Student s6 = new Student("Benet", 5060780);

        Student[] angelegteStudenten = {s1, s2, s3, s4, s5, s6};
        for (int i = 1; i < angelegteStudenten.length; i++) {
            r2.betreteRaum(angelegteStudenten[i]);
        }
        for (int i = 1; i < angelegteStudenten.length; i++){
            r2.verlasseRaum(angelegteStudenten[i]);
        }
    }
}

