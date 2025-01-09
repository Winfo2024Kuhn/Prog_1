package Lektion_10.ÜB1_Raumbelegung;

public class Student {
    String name;
    int matrikelnummer;
    public static int anzahlStudenten;
    public static Student[] Studenten = new Student[0];

    public Student(String name, int matrikelnummer) {
        boolean gültigeMatrikelnummer = true;
        this.name = name;
        for (int i = 0; i < Studenten.length; i++) {
            if (matrikelnummer == Studenten[i].matrikelnummer) {
                System.out.println("Diese Matrikelnummer " + matrikelnummer + " ist schon vergeben.");
                gültigeMatrikelnummer = false;
            }
        }
        if (gültigeMatrikelnummer) {
            this.matrikelnummer = matrikelnummer;
        }
        fügeStudentHinzu(this);
    }

    public static void fügeStudentHinzu(Student neuerStudent) {
        Student[] neuesArray = new Student[anzahlStudenten + 1];

        for (int i = 0; i < anzahlStudenten; i++) {
            neuesArray[i] = Studenten[i];
        }
        neuesArray[anzahlStudenten] = neuerStudent;
        Studenten = neuesArray;
        anzahlStudenten++;
    }
}
