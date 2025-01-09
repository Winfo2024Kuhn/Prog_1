package Mathe;

import javax.swing.*;
import java.util.Scanner;

public class GaussJordan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Anzahl der Gleichungen
        int n = readPositiveInteger(scanner, "Geben Sie die Anzahl der Gleichungen ein: ");

        // Eingabe der erweiterten Koeffizientenmatrix
        Fraction[][] matrix = new Fraction[n][n + 1];
        System.out.println("Geben Sie die Koeffizientenmatrix ein (einschließlich der rechten Seite):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                matrix[i][j] = new Fraction(readDouble(scanner, "Element [" + i + "][" + j + "]: "));
            }
        }

        // Anzeige der erweiterten Matrix
        System.out.println("\nErweiterte Matrix:");
        printMatrix(matrix);

        // Gauss-Jordan-Elimination mit Pivotisierung zur Reduktion der Matrix
        boolean success = gaussJordan(matrix);

        // Ausgabe der Lösung
        if (success) {
            System.out.println("\nMatrix in reduzierter Zeilenstufenform:");
            printMatrix(matrix);
            interpretSolution(matrix);
        } else {
            System.out.println("\nDas Gleichungssystem hat keine Lösung.");
        }

        scanner.close();
    }

    // Gauss-Jordan-Elimination zur Reduktion der Matrix mit Pivotisierung
    private static boolean gaussJordan(Fraction[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            // Pivotisierung: Größtes Element in der Spalte finden
            int maxRow = i;
            for (int k = i + 1; k < n; k++) {
                if (matrix[k][i].abs().greaterThan(matrix[maxRow][i].abs())) {
                    maxRow = k;
                }
            }
            // Prüfen, ob der Pivot gleich Null ist, dann hat das System möglicherweise keine eindeutige Lösung
            if (matrix[maxRow][i].numerator == 0) {
                continue;
            }
            // Zeilen tauschen
            Fraction[] temp = matrix[i];
            matrix[i] = matrix[maxRow];
            matrix[maxRow] = temp;

            // Anzeige der Matrix nach Zeilentausch
            System.out.println("\nMatrix nach Zeilentausch:");
            printMatrix(matrix);

            // Normiere die Pivot-Zeile
            Fraction pivot = matrix[i][i];
            if (pivot.numerator != 0) { // Ensure the pivot is not zero before dividing
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = matrix[i][j].divide(pivot);
                }
                System.out.println("\nNormiere Zeile " + (i + 1) + " mit dem Pivot " + pivot.toString() + ":");
            }

            // Anzeige der Matrix nach Normierung der Pivot-Zeile
            printMatrix(matrix);

            // Eliminiere die anderen Zeilen in der Pivot-Spalte
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    Fraction factor = matrix[k][i];
                    for (int j = 0; j < matrix[i].length; j++) {
                        matrix[k][j] = matrix[k][j].subtract(factor.multiply(matrix[i][j]));
                    }
                    System.out.println("\nZeile " + (k + 1) + " - (" + factor.toString() + ") * Zeile " + (i + 1) + ":");
                    printMatrix(matrix);
                }
            }
        }
        return true;
    }

    // Interpretation der Lösung
    private static void interpretSolution(Fraction[][] matrix) {
        int n = matrix.length;
        boolean hasNoSolution = false;
        boolean hasInfiniteSolutions = false;

        for (int i = 0; i < n; i++) {
            boolean isZeroRow = true;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j].numerator != 0) {
                    isZeroRow = false;
                    break;
                }
            }
            if (isZeroRow && matrix[i][n].numerator != 0) {
                hasNoSolution = true;
                break;
            } else if (isZeroRow && matrix[i][n].numerator == 0) {
                hasInfiniteSolutions = true;
            }
        }

        if (hasNoSolution) {
            System.out.println("Das Gleichungssystem hat keine Lösung.");
        } else if (hasInfiniteSolutions) {
            System.out.println("Das Gleichungssystem hat unendlich viele Lösungen.");
            System.out.println("Freier Parameter wird als 0 gesetzt.");
        } else {
            System.out.println("Das Gleichungssystem hat eine eindeutige Lösung:");
            printSolution(matrix);
        }
    }

    // Methode zur Eingabeüberprüfung (positive ganze Zahl)
    public static int readPositiveInteger(Scanner scanner, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value > 0) {
                    return value;
                }
            }
            System.out.println("Ungültige Eingabe. Bitte geben Sie eine positive ganze Zahl ein.");
            scanner.nextLine(); // Eingabe löschen
        }
    }

    // Methode zur Eingabeüberprüfung (Gleitkommazahl)
    public static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            }
            System.out.println("Ungültige Eingabe. Bitte geben Sie eine gültige Zahl ein.");
            scanner.nextLine(); // Eingabe löschen
        }
    }

    // Methode zur Anzeige der Matrix
    public static void printMatrix(Fraction[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Berechne die maximale Breite jeder Spalte
        int[] columnWidths = new int[m];
        for (int j = 0; j < m; j++) {
            int maxWidth = 0;
            for (int i = 0; i < n; i++) {
                int length = matrix[i][j].toString().length();
                if (length > maxWidth) {
                    maxWidth = length;
                }
            }
            // Berücksichtige die Variablennamen in der Kopfzeile
            String header = (j < m - 1) ? "x" + (j + 1) : "b";
            if (header.length() > maxWidth) {
                maxWidth = header.length();
            }
            columnWidths[j] = maxWidth + 2; // Füge etwas Puffer hinzu
        }

        // Kopfzeile drucken
        for (int j = 0; j < m; j++) {
            String header = (j < m - 1) ? "x" + (j + 1) : "b";
            String format = "%" + columnWidths[j] + "s";
            System.out.printf(format, header);
            if (j == m - 2) {
                System.out.print(" |");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        // Trennlinie unter der Kopfzeile
        for (int j = 0; j < m; j++) {
            System.out.print(repeat("-", columnWidths[j]));
            if (j == m - 2) {
                System.out.print("-+");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();

        // Matrixzeilen drucken
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                String format = "%" + columnWidths[j] + "s";
                System.out.printf(format, matrix[i][j].toString());
                if (j == m - 2) {
                    System.out.print(" |");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }


    // Ausgabe der Lösung
    public static void printSolution(Fraction[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("x%d = %s\n", i + 1, matrix[i][matrix[0].length - 1].toString());
        }
    }

    // Eigene Bruchklasse
    public static class Fraction {
        private int numerator;
        private int denominator;

        public Fraction(int numerator, int denominator) {
            if (denominator == 0) {
                throw new ArithmeticException("Denominator cannot be zero.");
            }
            this.numerator = numerator;
            this.denominator = denominator;
            simplify();
        }

        public Fraction(int numerator) {
            this(numerator, 1);
        }

        public Fraction(double value) {
            String str = Double.toString(value);
            int digitsDec = str.length() - 1 - str.indexOf('.');
            int denom = (int) Math.pow(10, digitsDec);
            int numer = (int) Math.round(value * denom);
            this.numerator = numer;
            this.denominator = denom;
            simplify();
        }

        private void simplify() {
            int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
            numerator /= gcd;
            denominator /= gcd;
            if (denominator < 0) {
                numerator = -numerator;
                denominator = -denominator;
            }
        }

        private int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public Fraction add(Fraction other) {
            int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
            int newDenominator = this.denominator * other.denominator;
            return new Fraction(newNumerator, newDenominator);
        }

        public Fraction subtract(Fraction other) {
            int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
            int newDenominator = this.denominator * other.denominator;
            return new Fraction(newNumerator, newDenominator);
        }

        public Fraction multiply(Fraction other) {
            return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);
        }

        public Fraction divide(Fraction other) {
            if (other.numerator == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            return new Fraction(this.numerator * other.denominator, this.denominator * other.numerator);
        }

        public Fraction abs() {
            return new Fraction(Math.abs(numerator), Math.abs(denominator));
        }

        public boolean equals(Fraction other) {
            return this.numerator == other.numerator && this.denominator == other.denominator;
        }

        public boolean greaterThan(Fraction other) {
            return this.numerator * other.denominator > other.numerator * this.denominator;
        }

        @Override
        public String toString() {
            if (denominator == 1) {
                return Integer.toString(numerator);
            } else {
                return numerator + "/" + denominator;
            }
        }
    }
}
