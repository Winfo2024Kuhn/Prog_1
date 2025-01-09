package Altklausuren;

public class OnlineShop {
    public static void main(String[] args) {
        // Testfälle
        System.out.println("1,99 -> " + new String(wandleUmInCents("1,99"))); // 199
        System.out.println("0,99 -> " + new String(wandleUmInCents("0,99"))); // 99
        System.out.println("0,90 -> " + new String(wandleUmInCents("0,90"))); // 90
        System.out.println("0,09 -> " + new String(wandleUmInCents("0,09"))); // 9
    }

    public static char[] wandleUmInCents(String euroPreis) {
        // 1. Schritt: Komma entfernen
        String ohneKomma = euroPreis.replace(",", "");

        // 2. Schritt: String in ein char-Array umwandeln
        char[] charArray = ohneKomma.toCharArray();

        // 3. Schritt: Führende Nullen entfernen
        int startIndex = 0;

        // Suche nach der ersten nicht-null ('0') Stelle
        while (charArray[startIndex] == '0') {
            startIndex++;
        }

        // Rückgabe: neues char-Array ohne führende Nullen
        char[] ergebnis = new char[charArray.length - startIndex];
        for (int i = 0; i < ergebnis.length; i++) {
            ergebnis[i] = charArray[startIndex + i];
        }

        return ergebnis;
    }
}