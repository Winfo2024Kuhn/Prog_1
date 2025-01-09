package Mathe;

import java.util.Scanner;

public class LaplaceExpansion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Anzahl der Gleichungen
        int n = readPositiveInteger(scanner, "Geben Sie die Anzahl der Gleichungen ein: ");

        // Eingabe der erweiterten Koeffizientenmatrix
        Fraction[][] extendedMatrix = new Fraction[n][n + 1];
        System.out.println("Geben Sie die Koeffizientenmatrix ein (einschließlich der rechten Seite):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                extendedMatrix[i][j] = new Fraction(readDouble(scanner, "Element [" + (i + 1) + "][" + (j + 1) + "]: "));
            }
        }

        // Anzeige der erweiterten Matrix
        System.out.println("\nErweiterte Matrix:");
        printMatrix(extendedMatrix);

        // Extrahiere die Koeffizientenmatrix
        Fraction[][] coefficientMatrix = new Fraction[n][n];
        for (int i = 0; i < n; i++) {
            System.arraycopy(extendedMatrix[i], 0, coefficientMatrix[i], 0, n);
        }

        // Auswahl der Entwicklung nach Zeile oder Spalte
        boolean expandByRow = false;
        while (true) {
            System.out.print("\nMöchten Sie nach einer Zeile oder Spalte entwickeln? (Z/S): ");
            String choice = scanner.next().trim().toUpperCase();
            if (choice.equals("Z")) {
                expandByRow = true;
                break;
            } else if (choice.equals("S")) {
                expandByRow = false;
                break;
            } else {
                System.out.println("Ungültige Eingabe. Bitte geben Sie 'Z' für Zeile oder 'S' für Spalte ein.");
            }
        }

        // Auswahl der Zeile oder Spalte
        int index = -1;
        if (expandByRow) {
            index = readIndex(scanner, "Geben Sie die Zeile an, nach der entwickelt werden soll (1 bis " + n + "): ", n);
        } else {
            index = readIndex(scanner, "Geben Sie die Spalte an, nach der entwickelt werden soll (1 bis " + n + "): ", n);
        }
        index--; // Indizes in Arrays beginnen bei 0

        // Berechnung der Determinante
        Fraction determinant = determinantLaplace(coefficientMatrix, expandByRow, index);

        System.out.println("\nDie Determinante der Koeffizientenmatrix ist: " + determinant.toString());

        scanner.close();
    }

    // Methode zur Berechnung der Determinante mittels Laplace-Entwicklung
    public static Fraction determinantLaplace(Fraction[][] matrix, boolean expandByRow, int index) {
        int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        }

        Fraction determinant = new Fraction(0);
        int sign = 1;

        if (expandByRow) {
            // Entwicklung nach Zeile
            for (int j = 0; j < n; j++) {
                Fraction[][] subMatrix = getSubMatrix(matrix, index, j);
                Fraction subDeterminant = determinantLaplace(subMatrix, true, 0);
                Fraction term = matrix[index][j].multiply(new Fraction(sign)).multiply(subDeterminant);
                determinant = determinant.add(term);
                sign *= -1;
            }
        } else {
            // Entwicklung nach Spalte
            for (int i = 0; i < n; i++) {
                Fraction[][] subMatrix = getSubMatrix(matrix, i, index);
                Fraction subDeterminant = determinantLaplace(subMatrix, true, 0);
                Fraction term = matrix[i][index].multiply(new Fraction(sign)).multiply(subDeterminant);
                determinant = determinant.add(term);
                sign *= -1;
            }
        }
        return determinant;
    }

    // Methode zur Erstellung der Untermatrix durch Streichen von Zeile und Spalte
    public static Fraction[][] getSubMatrix(Fraction[][] matrix, int excludingRow, int excludingCol) {
        int n = matrix.length;
        Fraction[][] subMatrix = new Fraction[n - 1][n - 1];
        int r = -1;
        for (int i = 0; i < n; i++) {
            if (i == excludingRow) continue;
            r++;
            int c = -1;
            for (int j = 0; j < n; j++) {
                if (j == excludingCol) continue;
                c++;
                subMatrix[r][c] = matrix[i][j];
            }
        }
        return subMatrix;
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
            } else {
                scanner.next(); // Eingabe löschen
            }
            System.out.println("Ungültige Eingabe. Bitte geben Sie eine positive ganze Zahl ein.");
        }
    }

    // Methode zur Eingabe eines gültigen Indexes
    public static int readIndex(Scanner scanner, String prompt, int max) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value > 0 && value <= max) {
                    return value;
                }
            } else {
                scanner.next(); // Eingabe löschen
            }
            System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl zwischen 1 und " + max + " ein.");
        }
    }

    // Methode zur Eingabeüberprüfung (Gleitkommazahl)
    public static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                scanner.next(); // Eingabe löschen
            }
            System.out.println("Ungültige Eingabe. Bitte geben Sie eine gültige Zahl ein.");
        }
    }

    // Methode zur Anzeige der erweiterten Matrix
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
            for (int k = 0; k < columnWidths[j]; k++) {
                System.out.print("-");
            }
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

    // Methode zum Wiederholen eines Strings
    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }

    // Eigene Bruchklasse (gleich wie zuvor)
    public static class Fraction {
        private int numerator;
        private int denominator;

        public Fraction(int numerator, int denominator) {
            if (denominator == 0) {
                throw new ArithmeticException("Nenner darf nicht null sein.");
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

        public Fraction multiply(int integer) {
            return new Fraction(this.numerator * integer, this.denominator);
        }

        public Fraction divide(Fraction other) {
            if (other.numerator == 0) {
                throw new ArithmeticException("Division durch Null ist nicht erlaubt.");
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
