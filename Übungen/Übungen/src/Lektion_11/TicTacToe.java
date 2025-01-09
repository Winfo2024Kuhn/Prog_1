package Lektion_11;

public class TicTacToe {
    public static void main(String[] args) {
        boolean[][][] ticTacToe = new boolean[30][30][30];

        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe[i].length; j++) {
                for (int k = 0; k < ticTacToe[j].length; k++) {
                    int zufallsZahl = (int) (Math.random() * 2);
                    if (zufallsZahl == 1) {
                        ticTacToe[i][j][k] = true;
                        System.out.print("X  ");
                    } else {
                        ticTacToe[i][j][k] = false;
                        System.out.print("O  " );
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}