package Lektion_7;

import java.util.Scanner;

public class ÜB2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean falseInput = true;
        System.out.print("Geben Sie die Anzahl der Versuche ein: ");
        int length = s.nextInt();

        // Kontrolle der Eingabe mit Schleife für Eingabe > 1
        while (falseInput) {

            if (length > 1) {
                System.out.println("Geben Sie Ihre Werte ein: ");
                // Array für Anzahl der Versuche/Noten
                double[] tries = new double[length];
                //Array mit Zahlen befüllen
                for (int i = 0; i < tries.length; i++) {
                    System.out.print("Wert " + (i + 1) + ": ");
                    tries[i] = s.nextDouble();
                }
                double min = getMinValue(tries);
                double max = getMaxValue(tries);
                System.out.println("Kleinster Wert: " + min);
                System.out.println("Größter Wert: " + max);
                System.out.println("Arithmetischer Mittelwert: " + getMean(tries));
                System.out.println("Standartabweichung: " + getStandardDeviation(tries));
                falseInput = false;
            } else {
                System.out.println("Geben Sie einen ganzzahligen Wert > 1 ein: ");
                length = s.nextInt();
            }
        }
    }

    // Mittelwert bekommen
    public static double getMean(double[] values) {
        double temp = 0;
        //Zähler = Summe der Werte im Array
        for (int i = 0; i < values.length; i++) {
            temp += values[i];
        }
        //Nenner = Größe des Arrays
        double mean = temp / (values.length);
        return mean;
    }

    //Die Standardabweichung ist eine quadratische Messung der Streuung (stärker von Ausreißern beeinflusst)
    // Standardabweichung bekommen
    public static double getStandardDeviation(double[] values) {
        double mean = getMean(values);
        double x;
        double temp = 0;
        //Zähler = (Jeder Wert - Mittelwert)^2
        for (int i = 0; i < values.length; i++) {
            x = values[i] - mean;
            temp += x * x;
        }
        //Nenner = Größe des Arrays
        double StandardDeviation = Lektion_5.ÜB4_Quadratwurzel.getSqrt(temp / values.length);
        //StandardDeviation = Wurzel aus Zähler/Nenner
        return StandardDeviation;
    }

    public static double getMinValue(double[] inputArray) {
        int n = inputArray.length;
        int minIndex = 1;

        // Schleife durch alle Zahlen
        for (int i = 0; i < n; i++) {
            // Vergleichen der Werte mit anschließender Überschreibung
            if (inputArray[i] < inputArray[minIndex]) {
                minIndex = i;
            }
        }
        return inputArray[minIndex];
    }

    public static double getMaxValue(double[] inputArray) {
        int n = inputArray.length;
        int maxIndex = 1;

        // Schleife gleich Größe von Array
        for (int i = 0; i < n; i++) {
            // Vergleichen der Werte mit anschließender Überschreibung
            if (inputArray[i] > inputArray[maxIndex]) {
                maxIndex = i;
            }
        }
        return inputArray[maxIndex];
    }
}

