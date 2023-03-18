package org.example;

/**
 * Check if given number is prime or not
 **/
public class PrimeNumberTask {
    void isPrimeNumber(int number) {
        if (number > 3) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("Number is not prime");
                    return;
                }
            }
        }
        System.out.println("Number is prime");
    }
}
