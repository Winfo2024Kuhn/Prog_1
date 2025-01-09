package Lektion_7;

public class ÜB6_Lottospiel {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 6 + 1);
        int[] array = new int[6];

        for (int i = 0; i < 6; i++) {
            // 49 mögliche Knoten
            int randomNumbers = (int) (Math.random() * 49 + 1);
            array[i] = randomNumbers;
        }
        minSort(array);
        System.out.println("Ihre Knoten sind: ");
        for (int f = 0; f < 6; f++) {
            System.out.print(array[f] + " ");
        }
    }

    public static int[] minSort(int[] input) {

        for (int i = 0; i < input.length; i++) {
            // Setze den aktuellen Index als den Index des kleinsten Elements
            int smalestIndex = i;
            int smallestValue = input[smalestIndex];

            //Suche nach dem kleinsten Element im unsortierten Teil des Arrays
            for (int j = i + 1; j < input.length; j++) {
                int valueToCompare = input[j];

                // Prüfe, ob das verglichene Element kleiner ist als das aktuelle Minimum
                if (valueToCompare < smallestValue) {
                    smalestIndex = j;
                    smallestValue = valueToCompare; // Aktualisiere den kleinsten Wert
                }
            }

            // Tausche den kleinsten gefundenen Wert mit dem Wert am aktuellen Index
            int temp = input[i];
            input[i] = smallestValue;
            input[smalestIndex] = temp;
        }

        // Gibt das sortierte Array zurück
        return input;
    }
}

