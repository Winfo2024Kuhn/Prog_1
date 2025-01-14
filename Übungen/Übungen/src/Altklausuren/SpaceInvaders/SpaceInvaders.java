package Altklausuren.SpaceInvaders;

import java.util.Scanner;

public class SpaceInvaders {
    int zeilen = 5;
    int spalten = 7;
    char[][] spielfeld = new char[zeilen][spalten];
    char raumschiff = 'V';
    char alien = 'O';
    int koordinateRaumschiff;

    public void initialisiereSpiel() {
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                if (i == 0) {
                    spielfeld[i][j] = alien;
                } else if (i == zeilen-1) {
                    int random = (int) (Math.random() * spalten);
                    koordinateRaumschiff = random;
                    spielfeld[i][random] = raumschiff;
                    break;
                }
            }
        }
        System.out.println(toString());
    }

    public void bewege(char c) {
        int alienZeile = zeilen - 1;
        if (c == 'a') {
            koordinateRaumschiff--;
            if (istImFeld()) {
                spielfeld[alienZeile][koordinateRaumschiff] = raumschiff;
                spielfeld[alienZeile][koordinateRaumschiff + 1] = '\0';
            } else koordinateRaumschiff++;
        } else if (c == 'd') {
            koordinateRaumschiff++;
            if (istImFeld()) {
                spielfeld[alienZeile][koordinateRaumschiff] = raumschiff;
                spielfeld[alienZeile][koordinateRaumschiff - 1] = '\0';
            } else koordinateRaumschiff--;
        } else System.out.print("Geben Sie nur 'a' oder 'd' ein: ");
        System.out.println(toString());
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                char traveler = spielfeld[i][j];
                if (traveler == '\0') {
                    s += " ";
                } else s += spielfeld[i][j];
            }
            s += "\n";
        }
        return s;
    }

    public boolean istImFeld() {
        if (koordinateRaumschiff >= 0 && koordinateRaumschiff < spalten) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SpaceInvaders spiel = new SpaceInvaders();
        spiel.initialisiereSpiel();
        while (true) {
            System.out.print("Geben sie 'a' oder 'b' ein: ");
            String input = s.nextLine();
            if (input == "") {
                System.out.println("Sie haben keine Eingabe getätigt");
            } else {
                char c = input.charAt(0);
                spiel.bewege(c);
            }
        }
    }
}
