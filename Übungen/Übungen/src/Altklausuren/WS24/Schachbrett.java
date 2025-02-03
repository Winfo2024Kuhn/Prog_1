package Altklausuren.WS24;

import java.util.Scanner;

public class Schachbrett {
    char[][] spielfeld;
    int zeilen;
    int spalten;
    int spaltenIndex;
    int zeilenIndex;

    public Schachbrett(int spalten, int zeilen) {
        spielfeld = new char[this.zeilen = zeilen][this.spalten = spalten];
        spaltenIndex = 0;
        zeilenIndex = 0;
    }

    public void fuegeHinzu(char in) {
        if (!istVoll()) {
            spielfeld[zeilenIndex][spaltenIndex] = in;
            spaltenIndex++;
            if (spaltenIndex == spalten) {
                spaltenIndex = 0;
                zeilenIndex++;
            }
        } else System.out.println("Das Spielfeld ist voll!");
    }

    public boolean istVoll() {
        return zeilenIndex == zeilen;
    }


    public String toString() {
        String s = "";
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                if (spielfeld[i][j] == '\0') {
                    s += " _ ";
                } else {
                    s += " " + spielfeld[i][j] + " ";
                }
            }
            s += "\n";
        }
        return s;
    }

    public int getZeilenIndex(String s) {
        char c = s.charAt(1);
        int out = -1;
        if (c >= '1' && c <= '8') {
            out = (c - '8') * -1;
        }
        return out;
    }

    public int getSpaltenIndex(String s) {
        char c = s.charAt(0);
        int out = -1;
        if (c >= 'A' && c <= 'H') {
            out = c - 'A';
        }
        return out;
    }

    public void geziehltEinfuegen(String s) {
        int spaltenIndex = getSpaltenIndex(s);
        int zeilenIndex = getZeilenIndex(s);
        if (spaltenIndex >= 0 && zeilenIndex >= 0) {
            spielfeld[zeilenIndex][spaltenIndex] = s.charAt(2);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Schachbrett schachbrett = new Schachbrett(8, 8);
//        while (!schachbrett.istVoll()) {
            System.out.print("Geben Sie ihren Buchstaben ein: ");
            String eingabe = s.nextLine();
            schachbrett.geziehltEinfuegen(eingabe);

//            char c = '\0';
//            if (!eingabe.equals("")) {
//                c = eingabe.charAt(0);
//            }
//            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
//                schachbrett.fuegeHinzu(c);
                System.out.println(schachbrett);
//            } else {
//                System.out.println("\nFalsch Eingabe!! \nGeben Sie nur a-z oder A-Z ein.\n");
//            }
//        }
    }
}
