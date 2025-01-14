package Ersetze;

public class Ersetze {
    public static void main(String[] args) {
        String s = "Graphik.Init.Datei.ini";
        String temp = "";
        char[] c = s.toCharArray();
        int anzahlPunkte = ersetze(c);

        for (int i = 0; i < c.length; i++) {
            if (c[i] == '.' && anzahlPunkte > 0) {
                c[i] = '_';
                anzahlPunkte--;
                temp += c[i];
                continue;
            }
            temp += c[i];
        }
        System.out.println(temp);
    }

    public static int ersetze(char[] in) {
        int counter = 0;
        for (int i = 0; i < in.length - 4; i++) {
            if (in[i] == '.') {
                counter++;
            }
        }
        return counter;
    }
}
