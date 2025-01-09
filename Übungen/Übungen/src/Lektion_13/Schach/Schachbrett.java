package Lektion_13.Schach;

public class Schachbrett {
    boolean[][] brett = new boolean[8][8];

    public void setzeTurm(int zeile, int spalte) {
        for (int i = 0; i < brett.length; i++) {
            for (int j = 0; j < brett[i].length; j++) {
                brett[i][j] = false;
            }
        }
        for (int i = 0; i< brett[zeile].length; i++){
            brett[i][spalte] = true;
        }
        for (int i = 0; i< brett.length; i++){
            brett[zeile][i] = true;
        }
    }

    @Override
    public String toString() {
        String s = "";
        String temp = "";
        for (int i = 0; i < brett.length; i++) {
            temp = "";
            for (int j = 0; j < brett[i].length; j++) {

                if (!brett[i][j]) {
                    temp += " O ";
                } else temp += " X ";
            }
            temp +="\n";
            s += temp;
        }
        return s;
    }
}
