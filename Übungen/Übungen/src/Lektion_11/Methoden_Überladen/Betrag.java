package Lektion_11.Methoden_Überladen;

public class Betrag {
    double ergebnis;
    char operator;

    public Betrag(char c, double a, double b) {
        if (isValidOperator(c)) {
            System.out.println("Das Ergebnis ist: " + calculate(a, b));
        }
    }

    private boolean isValidOperator(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/') {
            this.operator = c;
            return true;
        } else {
            System.out.println("Falscher Operator!");
            return false;
        }
    }

    private double calculate(double a, double b) {
        if (operator == '+') {
            return a + b;
        } else if (operator == '-') {
            return a - b;
        } else if (operator == '*') {
            return a * b;
        } else if (operator == '/') {
            return a / b;
        }
        else return 'F';
    }
}
