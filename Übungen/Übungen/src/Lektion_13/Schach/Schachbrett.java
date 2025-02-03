package Lektion_13.Schach;

public class Schachbrett {
    private boolean[][] brett = new boolean[8][8];
    public Schachbrett(){
        for (int i = 0; i < brett.length; i++){
            for (int j = 0; j< brett[i].length; j++){
                brett[i][j] = false;
            }
        }
    }
    public void setzeTurm(int x, int y){
        for (int i = 0; i < brett.length; i++){
            for (int j = 0; j < brett[i].length; j++){
                brett[i][y] = true;
                brett[x][j] = true;
            }
        }
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < brett.length; i++) {
            for (int j = 0; j < brett[i].length; j++) {
                if (brett[i][j] == true) {
                    s += " x ";
                } else s += " 0 ";
            }
            s += "\n";
        }
        return s;
    }
    public static void main(String[] args){
        Schachbrett s = new Schachbrett();
        s.setzeTurm(3,5);
        System.out.println(s);
    }
}
