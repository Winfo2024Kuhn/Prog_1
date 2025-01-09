package Lektion_10.ÜB1_Raumbelegung;

public class Raum {
    private String RaumName;
    public int kapazität;
    public Student[] StudentenImRaum;
    private boolean RaumBelegt;

    public Raum(String name, int kapazität) {
        this.RaumName = name;
        if (kapazität < 1) {
            this.kapazität = 50;
        } else this.kapazität = kapazität;
        this.RaumBelegt = false;
        this.StudentenImRaum = new Student[kapazität];
    }

    // Getter für Kennung
    public int getAnzahlStudImRaum() {
        int counter = 0;
        for (int i = 0; i < StudentenImRaum.length; i++) {
            if (StudentenImRaum[i] != null) {
                counter++;
            }
        }
        return counter;
    }

    public void belegeRaum() {
            RaumBelegt = true;
            System.out.println("Der Raum " + RaumName + " ist jetzt belegt.");
    }

    public void gebeRaumFrei(){
            RaumBelegt = false;
            System.out.println("Der Raum " + RaumName + " ist jetzt wieder frei.");

    }

    public void betreteRaum(Student s) {
        if (getAnzahlStudImRaum() == StudentenImRaum.length) {
            System.out.println("Der Raum " + RaumName + " ist voll. Kein weiterer Studierender kann eintreten.");
            return;
        }

        for (int i = 0; i < StudentenImRaum.length; i++) {
            if (StudentenImRaum[i] == null) {
                StudentenImRaum[i] = s;
                System.out.println(s.name + " mit der Matrikelnummer "
                        + s.matrikelnummer + " ist dem Raum beigetreten.");
                break;
            }
        }

        if (getAnzahlStudImRaum() == StudentenImRaum.length) {
            belegeRaum();
        }
    }

    public void verlasseRaum(Student s) {
        if (getAnzahlStudImRaum() == 0) {
            System.out.println("Der Raum " + RaumName + " ist bereits leer.");
            return;
        }

        boolean studentIstImRaum = false;
        for (int i = 0; i < StudentenImRaum.length; i++) {
            if (StudentenImRaum[i] == s) {
                StudentenImRaum[i] = null;
                System.out.println(s.name + " mit der Matrikelnummer "
                        + s.matrikelnummer + " hat den Raum verlassen.");
                studentIstImRaum = true;
                break;
            }
        }
        if (!studentIstImRaum) {
            System.out.println(s.name + " war nicht im Raum");
        }
        if (getAnzahlStudImRaum() == 0) {
            gebeRaumFrei();
        }
    }
}




