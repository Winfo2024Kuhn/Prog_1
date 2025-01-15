package Altklausuren;

public class OnlineShop {
    public static void main(String[] args) {
        String betrag = "0sf000,56dfsggdf€";
        char[] c = wandleUmInCents(betrag);
        String s = new String(c);
        System.out.println("Der Centbetrag von " + betrag + " ist : " + s);
    }

    public static char[] wandleUmInCents(String EuroCentBetrag) {
        String s = EuroCentBetrag.replace(",", "");
        char[] temp = s.toCharArray();
        int counter = 0;
        boolean istAufZahl = false;
        while (!istAufZahl && counter < temp.length) {
            if (temp[counter] > '0' && temp[counter] <= '9') {
                istAufZahl = true;
            } else {
                temp[counter] = '\0';
                counter++;
            }
        }
        counter = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] >= '0' && temp[i] <= '9') {
                counter++;
            } else temp[i] = '\0';
        }
        char[] finalCharArray = new char[counter];
        counter = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != '\0') {
                finalCharArray[counter] = temp[i];
                counter++;
            }
        }
        return finalCharArray;
    }
}
