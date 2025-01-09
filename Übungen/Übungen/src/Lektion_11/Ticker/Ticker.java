package Lektion_11.Ticker;

public class Ticker {
    private char[] nachricht;

    public Ticker(int pufferGroesse) {
        if (pufferGroesse <= 0) {
            nachricht = new char[200];
        } else nachricht = new char[pufferGroesse];
    }

    public int getGroesse() {
        return nachricht.length;
    }

    public void setNachricht(char[] nachricht) {

        for (int i = 0; i < this.nachricht.length; i++) {
            if (i < nachricht.length) {
                this.nachricht[i] = nachricht[i];
            } else this.nachricht[i] = '+';
        }
    }

    public char[] getNachricht() {
        return nachricht;
    }

    public void resetNachricht(char zeichen) {
        for (int i = 0; i < nachricht.length; i++) {
            nachricht[i] = zeichen;
        }
    }

    public void resetNachricht() {
        for (int i = 0; i < nachricht.length; i++) {
            nachricht[i] = '+';
        }
    }

    public void rotateNachricht(int distance) {
        char[] tempArray = new char[nachricht.length];
        for (int i = 0; i < nachricht.length; i++) {
            if (i + distance < nachricht.length) {
                tempArray[i] = nachricht[i + distance];
            } else {
                tempArray[i] = nachricht[(i + distance) - nachricht.length];
            }
        }
        nachricht = tempArray;
    }

    public void print() {
        String s = "";
        for (int i = 0; i < nachricht.length; i++) {
            s += nachricht[i];
        }
        System.out.println(s);
    }
}