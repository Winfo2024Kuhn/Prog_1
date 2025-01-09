package Lektion_7;

import java.util.Scanner;

public class ÜB4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie einen Satz oder ein Wort ein:");
        String word = s.nextLine();
        System.out.println("\n" + "Das neu Wort ist: ");
        System.out.println(addBAndVocal(word));
    }

    public static String addBAndVocal(String input) {
        char[] startCharArray = input.toCharArray();
        String tempString = "";
        
        for (int i = 0; i < startCharArray.length; i++) {
            tempString += startCharArray[i];
            if (isVocal(startCharArray[i])) {
                tempString += "b";
                tempString += startCharArray[i];
            }
        }
        return tempString;
    }

    public static boolean isVocal(char input) {
        char tempVocalValue;
        char[] vocalArray = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for (int i = 0; i < vocalArray.length; i++) {
            tempVocalValue = vocalArray[i];
            if (tempVocalValue == input) {
                return true;
            }
        }
        return false;
    }
}

//public static String addBAndVocal(String input) {
//    char[] startCharArray = input.toCharArray();
//    char[] finalCharArray;
//    int addToArray = 0;
//    // Berechnet die größe des Arrays finalCharArray anhand der Vokale
//    for (int i = 0; i < startCharArray.length; i++) {
//        if (isVocal(startCharArray[i]) == true) {
//            addToArray += 2;
//        }
//    }
//    finalCharArray = new char[addToArray + startCharArray.length];
//
//    int indexFinalCharArray = 0;
//
//    //Überprüft
//    for (int j = 0; j < startCharArray.length; j++) {
//        if (isVocal(startCharArray[j]) == true) {
//            finalCharArray[indexFinalCharArray++] += startCharArray[j];
//            finalCharArray[indexFinalCharArray++] += 'b';
//            finalCharArray[indexFinalCharArray++] += startCharArray[j];
//        } else {
//            finalCharArray[indexFinalCharArray++] += startCharArray[j];
//        }
//
//    }
//    return String.valueOf(finalCharArray);
//}