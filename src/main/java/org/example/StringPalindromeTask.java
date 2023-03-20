package org.example;

/**
 * Check if a given String is palindrome or not
 **/
public class StringPalindromeTask {
    void isStringPalindrome(String word) {
        word = word.toLowerCase();
        int i = 0;
        while ((word.length() - 1 - i) > i) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                System.out.println("String is not palindrome");
                return;
            }
            i++;
        }
        System.out.println("String is palindrome");
    }
}
