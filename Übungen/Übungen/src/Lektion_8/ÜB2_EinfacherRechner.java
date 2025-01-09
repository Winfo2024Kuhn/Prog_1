package Lektion_8;

public class ÜB2_EinfacherRechner {
    public static void main(String[] args) {
        // Prüfen, ob genügend Argumente übergeben wurden
        if (args.length < 3) {
            System.out.println("Bitte mindestens zwei Zahlen und einen Operator (+ oder -) übergeben.");
            return;
        }

        // Operator auslesen
        String operator = args[args.length - 1];
        if (!operator.equals("+") && !operator.equals("-")) {
            System.out.println("Ungültiger Operator. Bitte + oder - verwenden.");
            return;
        }

        // Zahlen verarbeiten
        int result = Integer.parseInt(args[0]); // Erste Zahl als Startwert
        for (int i = 1; i < args.length - 1; i++) {
            int number = Integer.parseInt(args[i]);
            if (operator.equals("+")) {
                result += number;
            } else {
                result -= number;
            }
        }

        // Ergebnis ausgeben
        System.out.println("Ergebnis: " + result);
    }
}
