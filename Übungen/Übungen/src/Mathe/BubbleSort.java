package Mathe;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Geben Sie die größe des Arrays ein:");
        int größe = s.nextInt();

        int[] array = new int[größe];

        System.out.println("Geben Sie der Reihenfolge nach die Zahlen ein:");
        for (int i = 0; i < array.length; i++) {

            int zahl = s.nextInt();
            array[i] = zahl;
        }
        System.out.println("Array erfolgreich gefüllt");
        System.out.println("Ihr neues Array ist: ");

        sortiert(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Zahl " + (i + 1) + " ist " + array[i]);
        }
    }

    public static void sortiert(int[] input) {
        boolean sortiert;
        do {
            sortiert = true; // Annahme: Das Array ist sortiert
            for (int i = 0; i < input.length - 1; i++) { // bis input.length - 1, um Array-Grenzen zu vermeiden
                if (input[i] > input[i + 1]) {
                    // Elemente tauschen
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    sortiert = false; // Array war nicht sortiert, Schleife läuft weiter
                }
            }
        } while (!sortiert); // Wiederholen, bis keine Vertauschungen mehr stattfinden
    }

}

