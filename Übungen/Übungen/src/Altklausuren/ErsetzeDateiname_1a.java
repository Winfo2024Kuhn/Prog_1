package Altklausuren;

public class ErsetzeDateiname_1a {
    public static void main(String[] args) {
        String fileName = "Image.1.jpg";
        char[] c = fileName.toCharArray();
        System.out.println(ersetzeB(c));
    }

    public static int ersetze(char[] c) {
        int d = 4; // Anzahl bis zur Dateiendung
        int counter = 0;
        for (int i = 0; i < c.length - d; i++) {
            if (c[i] == '.') {
                c[i] = '_';
                counter++;
            }
        }
        return counter;
    }

    public static String ersetzeB(char[] c) {
        int d = 4; // Anzahl bis zur Dateiendung
        String finalString = "";
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '.' && i != c.length - d) {
                c[i] = '_';
            }
            finalString += c[i];
        }
        return finalString;
    }
}


