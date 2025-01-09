package Lektion_2;
import java.time.LocalTime;// Importieren der aktuellen Zeit

public class L2_UE3_Uhrzeit {
    public static void main(String[] args) {
        LocalTime jetzt = LocalTime.now();
        int Stunden = jetzt.getHour(); // Stunden extrahieren als int
        int Minuten = jetzt.getMinute(); // Minuten extrahieren als int
        int Sekunden = jetzt.getSecond();// Sekunden extrahieren als int


        int GesamtSekundenProTag = 24 * 60 * 60;// Gesamtsekunden pro Tag
        float a = (Stunden*60*60)+(Minuten*60)+(Sekunden); //vergangene Sekunden seit 0:00 Uhr.
        float b = GesamtSekundenProTag - a; // verbleibende Sekunden bis 0:00 Uhr.
        float c = (a/GesamtSekundenProTag)*100; // Vergangene Zeit vom Tag in Prozent.


        System.out.println("a) Es sind bereits " + (int) a + " Sekunden seit Mitternacht vergangen.");
        System.out.println("b) Noch " + (int) b + " verbleibende Sekunden bis Mitternacht.");
        System.out.println("c) Es sind bereits "+ (int) c+"% vom Tag vergangen.");

        // Aktuelle Zeit ausgeben mit bedingung 0 + String if int < 10
        String Stundenstring;
        String Minutenstring;

            if (Stunden < 10) {
                Stundenstring = "0" + Stunden;
            }
            else {
                Stundenstring = "" + Stunden;
            if (Minuten < 10) {
                     Minutenstring = "0" + Minuten;
            }
            else {
                Minutenstring = "" + Minuten;
            }
            System.out.println("d) Es ist " + Stundenstring + ":" + Minutenstring + " Uhr.");
        }
    }
}
