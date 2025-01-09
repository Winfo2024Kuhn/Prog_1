package Lektion_8;

import java.util.Scanner;

public class ÜB1_galgenmännchen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Initialisierung der Wörter
        String[] words = {
                "PROGRAMMIEREN", "TASTATUR", "SCHLEIFE", "METHODEN", "SCANNER",
                "WHILE", "FOR", "BOOLEAN", "KLASSE", "OBJEKT", "DOUBLE", "CODE",
                "SYNTAX", "CHAR", "ARRAY", "STRING", "JAVA", "DEBUGGING", "BUG", "RANDOM"
        };
        // Randomisiertes Wort bekommen
        int stringIndex = (int) (Math.random() * words.length + 1);
        String myWord = words[stringIndex];

        // Wort in verborgenes Char Array umwandeln
        char[] hiddenChars = myWord.toCharArray();
        // Wort in Unterstriche verschlüsseln
        char[] visibleChars = encryptWord(myWord);

        boolean isWordGuessed = false;
        int counter = 0; // Starte mit 0 Versuchen

        System.out.println("Das Spiel geht los!");

        do {
            System.out.println((counter + 1) + ". Versuch " + String.valueOf(visibleChars));
            System.out.print("Geben Sie einen Buchstaben ein: ");
            String input = s.next();

            //Eingabe auf Länge prüfen
            if (input.length() == 1) {
                char charInput = replaceLowercaseLetter(input.charAt(0));
                // Eingabe auf Syntax prüfen
                if (charInput == '-') {
                    System.out.println("Geben Sie nur Buchstaben ein.");
                    continue;
                }

                boolean letterGuessed = false;

                // Verschlüsseltes Array überschreiben, wenn Buchstabe Teil des Wortes
                for (int i = 0; i < hiddenChars.length; i++) {
                    if (hiddenChars[i] == charInput) {
                        visibleChars[i] = charInput;
                        letterGuessed = true;
                    }
                }
                // Wenn Buchstabe nicht Teil des Wortes Zähler erhöhen und Ausgabe
                if (!letterGuessed) {
                    System.out.println("Der Buchstabe " + charInput + " ist nicht im Wort enthalten.");
                    counter++;
                }

                // Prüfen, ob das Wort vollständig erraten wurde
                isWordGuessed = true;
                for (int i = 0; i < visibleChars.length; i++) {
                    if (visibleChars[i] == '_') {
                        isWordGuessed = false;
                        break;
                    }
                }
                // Ausgabe für falsche Syntax Zähler nicht erhöhen
            } else {
                System.out.println("Geben Sie nur einen Buchstaben ein.");
            }
        } while (!isWordGuessed && counter < 5);

        // Ausgabe je nach Abbruchkriterium der Schleifenbedingung
        if (isWordGuessed) {
            System.out.println("Sie haben gewonnen! Das Wort war: " + myWord);
        } else {
            System.out.println("Sie haben verloren! Das Wort war: " + myWord);
        }
    }

    // Methode zum Verschlüsseln des randomisierten Wortes
    public static char[] encryptWord(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = '_';
        }
        return chars;
    }

    // Methode zur Eingabeüberprüfung
    public static char replaceLowercaseLetter(char input) {
        char output;
        if (input >= 'a' && input <= 'z') {
            output = (char) (input - 32); // Laut ASCII von 'A' bis 'a' 32 (dez) Unterschied
            return output;
        }
        if (input >= 'A' && input <= 'Z') {
            return input; // Großbuchstaben bleiben unverändert
        }
        return '-'; // Ungültige Eingaben
    }
}
