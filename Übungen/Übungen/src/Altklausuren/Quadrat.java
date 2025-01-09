package Altklausuren;

public class Quadrat {
    public static void main(String[] args) {
        String s = printQuadrat(6);
        System.out.print(s);
    }

    private static String printQuadrat(int zeilen) {
        char[][] quadrat = new char[zeilen][zeilen];
        String s = "";
        for (int i = 0; i < quadrat.length; i++) {
            for (int j = 0; j < quadrat[i].length; j++) {
                if (i == 0 || i == zeilen - 1 || j == 0 || j == zeilen - 1) {
                    quadrat[i][j] = '*';
                } else quadrat[i][j] = ' ';
                s += quadrat[i][j] + "  ";
            }
            s +="\n";
        }
        return s;
    }
}
