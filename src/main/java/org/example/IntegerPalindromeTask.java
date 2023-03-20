package org.example;

/**
 * Check if given Integer is palindrome or not
 **/
public class IntegerPalindromeTask {
    void isIntegerPalindrome(Integer number) {
        int reverseNumber = reverseNumber(number);
        int numberSize = getNumberSize(number);
        for (int i = 0; i < numberSize; i++) {
            if (number % 10 != reverseNumber % 10) {
                System.out.println("Integer is not palindrome");
                return;
            }
            number = number / 10;
            reverseNumber = reverseNumber / 10;
        }
        System.out.println("Integer is palindrome");
    }

    private int reverseNumber(int number) {
        int newNumber = 0;
        while (number > 0) {
            newNumber = newNumber * 10;
            newNumber += number % 10;
            number = number / 10;
        }
        return newNumber;
    }

    private int getNumberSize(int number) {
        int size = 0;
        while (number > 0) {
            number = number / 10;
            size++;
        }
        return size;
    }
}
