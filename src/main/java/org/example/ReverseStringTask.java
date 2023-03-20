package org.example;

public class ReverseStringTask {
    void getReverseString(String word) {
        char[] lettersArray = word.toCharArray();
        char[] reverseArray = new char[lettersArray.length];
        for (int i = 0; i < lettersArray.length; i++) {
            reverseArray[i] = lettersArray[lettersArray.length - 1 - i];
        }
        StringBuilder reverseString = new StringBuilder();
        for (int i = 0; i < reverseArray.length; i++) {
            reverseString.append(reverseArray[i]);
        }
        System.out.println(reverseString);
    }
}
