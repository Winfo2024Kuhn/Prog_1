package Ersetze;

public class Ersetze {
    public static int ersetze(char[] in) {
        int counter = 0;
        for (int i = 0; i < in.length - 4; i++) {
            if (in[i] == '.') {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String s = "Graphik.Init.Datei.ini";
        char[] c = s.toCharArray();
        int x = ersetze(c);
        int counter = 0;
        while (x > 0){
            if (c[counter] == '.'){
                c[counter] = '_';
                x--;
            }
            counter ++;
        }
        s ="";
        for (int i = 0; i < c.length; i++){
            s+= c[i];
        }
        System.out.println(s);
    }
}