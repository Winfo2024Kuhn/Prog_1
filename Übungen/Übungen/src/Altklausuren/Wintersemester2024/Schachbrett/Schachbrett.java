package Altklausuren.Wintersemester2024.Schachbrett;

public class Schachbrett {
    char[][] spielfeld;
    int indexZeile;
    int indexSpalte;

    public Schachbrett() {
        indexZeile = 0;
        indexSpalte = 0;
        spielfeld = new char[8][8];
    }

    public void fuegeHinzu(char in) {
        if (!istVoll()) {
            if (indexSpalte < 8) {
                spielfeld[indexZeile][indexSpalte] = in;
                indexSpalte++;
            } else {
                indexZeile++;
                indexSpalte = 0;
                spielfeld[indexZeile][indexSpalte] = in;
            }
        } else System.out.println("Das Schachbrett ist voll!!");
    }

    public boolean istVoll() {
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                if (spielfeld[i][j] == '\0') {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                if (spielfeld[i][j] == '\0') {
                    s += " _ ";
                } else s += " " + spielfeld[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }

    public int getErsteEbene(String s) {
        char c = s.charAt(1);
        if (c >= '0' && c <= '7') {
            return (c - '8') * -1;
        } else return -1;
    }

    public int getZweiteEbene(String s) {
        char c = s.charAt(0);
        if (c >= 'a' && c <= 'h') {
            return (c - 'a');
        } else return -1;
    }

    public static void main(String[] args) {
        Schachbrett schachbrett = new Schachbrett();
        while (!schachbrett.istVoll()) {
            schachbrett.fuegeHinzu('h');
        }
        System.out.println(schachbrett.toString());
        String s = "(" + schachbrett.getErsteEbene("d3") + "," + schachbrett.getZweiteEbene("d3") + ")";
        System.out.println(s);
    }
}
