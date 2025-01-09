package Altklausuren.SozialesNetzwerk;

public class Timeline {
    Post start;

    public Timeline() {
        start = null;
    }

    public void fuegePostEin(Post neu) {
        if (start == null) {
            start = neu;
        } else {
            Post temp = start;
            start = neu;
            start.next = temp;
        }
    }

    public String gibAus() {
        String s = "";
        Post temp = start; // Temp zeigt auf den Start der Timeline

        // Durchlaufen der verketteten Liste
        while (temp != null) {
            // Post-Inhalt zur Ausgabe hinzufügen
            s += temp.absender + " -> " + temp.empfaenger + "\n" + temp.text + "\n\n";

            // Zum nächsten Post gehen
            temp = temp.next;
        }

        return s; // Rückgabe der gesamten Timeline als String
    }
}
