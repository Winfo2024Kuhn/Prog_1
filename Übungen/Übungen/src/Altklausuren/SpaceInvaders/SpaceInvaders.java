package Altklausuren.SpaceInvaders;

public class SpaceInvaders {
    private char[][] spielfeld;
    private int schiffZeile = 4;
    private int schiffSpalte;
    char alien = 'o';
    char schiff = 'v';//

    public SpaceInvaders() {
        spielfeld = new char[5][8];
        schiffSpalte = (int) (Math.random() * 8);
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                if (i == 0) {
                    spielfeld[i][j] = alien;
                } else spielfeld[i][j] = ' ';
                if (i == schiffZeile && j == schiffSpalte) {
                    spielfeld[i][j] = schiff;
                }
            }
        }

    }

    public void bewege(char c) {
        for (int i = 0; i < spielfeld[schiffZeile].length; i++) {
            spielfeld[schiffZeile][i] = ' ';
        }
        if (c == 'a' && istImFeld(schiffSpalte - 1)) {
            schiffSpalte--;
        }
        if (c == 'd' && istImFeld(schiffSpalte + 1)) {
            schiffSpalte++;
        }
        spielfeld[schiffZeile][schiffSpalte] = schiff;
    }

    public boolean istImFeld(int schiffSpalte) {
        if (schiffSpalte >= 0 && schiffSpalte <= 7) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                s += (spielfeld[i][j]);
                s += " ";
            }
            s += ('\n');
        }
        return s;
    }

    public static void main(String[] args) {
        SpaceInvaders spiel = new SpaceInvaders();
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println(spiel);

        // Schleife bis 'x' eingegeben wird
        while (true) {
            char eingabe = s.next().charAt(0);
            if (eingabe == 'x') break;
            spiel.bewege(eingabe);
            System.out.println(spiel);
        }
        s.close();
        System.out.println("Spiel beendet.");
    }
}
