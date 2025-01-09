package Altklausuren.Passwort;

public class Passwort {
    String zeichenkette;
    boolean geeignet;

    public Passwort(String zeichenkette) {
        if (alsPwGeeignet(zeichenkette)){
            this.zeichenkette = zeichenkette;
        }
        else this.zeichenkette = null;
    }

    public boolean alsPwGeeignet(String zeichenkette) {
        int counterGB = 0;
        int counterKB = 0;
        int counterZiffer = 0;

        char[] temp = zeichenkette.toCharArray();
        // Längenüberprüfung
        if (temp.length < 8) {
            return false;
        }
        // Schleife für alle Chars
        for (int i = 0; i < temp.length; i++) {
            char c = temp[i];
            if (c >= 'A' && c <= 'Z') {
                counterGB++;
            } else if (c >= 'a' && c <= 'z') {
                counterKB++;
            } else if (c >= '0' && c <= '9') {
                counterZiffer++;
            }
        }
        if (counterZiffer > 1 && counterKB > 1 && counterGB > 1) {
            return true;
        } else {
            System.out.println("Kein gültiges Passwort!");
            return false;
        }
    }

    public boolean pwAendern(String zeichenkette) {
        if (alsPwGeeignet(zeichenkette)) {
            char[] pwAlt = this.zeichenkette.toCharArray();
            char[] pwNeu = zeichenkette.toCharArray();
            if (pwAlt[0] == pwNeu[0] && pwAlt[pwAlt.length - 1] == pwNeu[pwNeu.length - 1]) {
                return false;
            } else {
                this.zeichenkette = zeichenkette;
                return true;
            }
        } else return false;
    }
}
