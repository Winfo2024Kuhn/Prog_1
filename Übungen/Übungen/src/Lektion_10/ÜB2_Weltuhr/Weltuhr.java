package Lektion_10.ÜB2_Weltuhr;

public class Weltuhr {
    int sekunden;
    int minuten;
    int stunden;

    public Weltuhr(int sekunden, int minuten, int stunden) {
        if (!korrekteEingabe(sekunden, minuten, stunden)) {
        } else {
            this.sekunden = sekunden;
            this.minuten = minuten;
            this.stunden = stunden;
        }
    }

    // Getter
    public int getStd() {
        return stunden;
    }

    public int getMin() {
        return minuten;
    }

    public int getSek() {
        return sekunden;
    }

    // Setter
    public void setUhr(int sekunden, int minuten, int stunden) {
        if (!korrekteEingabe(sekunden, minuten, stunden)) {
        } else {
            this.sekunden = sekunden;
            this.minuten = minuten;
            this.stunden = stunden;
        }
    }

    private boolean korrekteEingabe(int sekunden, int minuten, int stunden) {
        boolean valideSekunden = sekunden >= 0 && sekunden <= 60;
        boolean valideMinuten = minuten >= 0 && minuten <= 60;
        boolean valideStunden = stunden >= 0  && stunden <= 24;
        if (valideSekunden && valideMinuten && valideStunden) {
            return true;
        } else {
            this.sekunden = 0;
            this.minuten = 0;
            this.stunden = 12;
        }
        return false;
    }

    public void nächsteSek() {
        sekunden++;
    }

}
