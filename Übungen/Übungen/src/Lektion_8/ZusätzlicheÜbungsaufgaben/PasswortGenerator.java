package Lektion_8.ZusätzlicheÜbungsaufgaben;

public class PasswortGenerator {

    private final String createFrom;
    private String password;
    private int nrOfSpecialChars;
    private int nrOfDigits;
    private boolean accepted;

    public PasswortGenerator(String createFrom) {
        this.createFrom = createFrom;
        this.password = generatePassword();
        this.nrOfSpecialChars = 0;
        this.nrOfDigits = 0;
        this.accepted = validate();
    }

    public String generatePassword() {
        String newPassword = "";
        int counter = 0;

        for (int i = 0; i < createFrom.length(); ) {
            // Überspringe führende Leerzeichen
            while (i < createFrom.length() && createFrom.charAt(i) == ' ') {
                i++;
            }

            // Finde das Ende des Wortes
            int wordStart = i;
            while (i < createFrom.length() && createFrom.charAt(i) != ' ') {
                i++;
            }
            int wordEnd = i;

            // Extrahiere das Wort
            if (wordStart < wordEnd) {
                String word = createFrom.substring(wordStart, wordEnd);
                char lastChar = word.charAt(word.length() - 1);

                // Verarbeite Sonderzeichen im Wort
                for (int j = 0; j < word.length(); j++) {
                    char c = word.charAt(j);
                    if (isSpecialChar(c) && j != word.length() - 1) {
                        newPassword += c;
                    }
                }

                // Verarbeite das letzte Zeichen
                if (!isSpecialChar(lastChar)) {
                    if (counter % 2 == 0) {
                        newPassword += (toLowerCase(lastChar));
                    } else {
                        newPassword += (toUpperCase(lastChar));
                    }
                } else {
                    newPassword += (lastChar);
                }
                counter++;
            }
        }
        System.out.println("Das ist Ihr aktuelles Passwort: " + newPassword);
        return newPassword;
    }

    // Getter Methoden
    public int getNrOfDigits() {
        return nrOfDigits;
    }

    public int getNrOfSpecialChars() {
        return nrOfSpecialChars;
    }

    // Passwort validieren
    public boolean validate() {
        nrOfSpecialChars = 0;
        nrOfDigits = 0;

        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (isSpecialChar(currentChar)) {
                nrOfSpecialChars++;
            } else if (isDigit(currentChar)) {
                nrOfDigits++;
            }
        }

        if (nrOfSpecialChars < 1 || nrOfDigits < 1 || password.length() < 8) {
            System.out.println("Das Passwort ist nicht sicher genug! \n" +
                    "Das Passwort muss mindestens 8 Zeichen enthalten, ein Sonderzeichen und eine Ziffer.");
            return false;
        } else {
            System.out.println("Das Passwort entspricht den genannten Kriterien.");
            return true;
        }
    }

    // Zeichen zu Passwort hinzufügen
    public void addCharToPassword(char c) {
        if (isDigit(c)) {
            nrOfDigits++;
        } else if (isSpecialChar(c)) {
            nrOfSpecialChars++;
        }

        password += c;

        if (!validate()) {
            System.out.println("Sie haben: \n" +
                    "Zahlen: " + nrOfDigits +
                    "\nSonderzeichen: " + nrOfSpecialChars);
        }
    }

    // Hilfsmethoden
    public static boolean isSpecialChar(char c) {
        return c == '!' || c == '?' || c == ':' || c == '%' || c == '@';
    }

    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + 32);
        }
        return c;
    }

    public static char toUpperCase(char c) {
        if (c >= 'a' && c <= 'z') {
            return (char) (c - 32);
        }
        return c;
    }
}
