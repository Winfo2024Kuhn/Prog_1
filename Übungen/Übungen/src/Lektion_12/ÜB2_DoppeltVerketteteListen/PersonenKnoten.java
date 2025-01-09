package Lektion_12.ÜB2_DoppeltVerketteteListen;

public class PersonenKnoten {
    public int alter;
    String nachname;
    PersonenKnoten prev;
    PersonenKnoten next;
    public PersonenKnoten(int alter, String nachname){
        this.alter = alter;
        this.nachname = nachname;
    }
    public String toString(){
        return "Nachname: " + nachname + " Alter: " + alter;
    }

}
