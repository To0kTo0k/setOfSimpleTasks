package org.example;

public class FactorialTask {
    void getFactorial(int number) {
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
