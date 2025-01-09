package Lektion_12.ÜB2_DoppeltVerketteteListen;

public class Main {
    public static void main(String[] args) {
        Liste freundeListe = new Liste();
        PersonenKnoten[] freunde = new PersonenKnoten[8];
        freunde[0] = new PersonenKnoten(26, "Luka");
        freunde[1] = new PersonenKnoten(26, "Janek");
        freunde[2] = new PersonenKnoten(26, "Sebastian");
        freunde[3] = new PersonenKnoten(24, "Nico");
        freunde[4] = new PersonenKnoten(25, "Tim");
        freunde[5] = new PersonenKnoten(30, "Heinz");
        freunde[6] = new PersonenKnoten(98, "Günter");
        freunde[7] = new PersonenKnoten(45, "Thomas");

        for (int i = 0; i < freunde.length; i++) {
            freundeListe.sortInsert(freunde[i]);
        }
        freundeListe.print();
    }
}
