package org.example;

/**
 * Print Fibonacci series up to given number
 **/
public class FibonacciSeriesTask {
    void getFibonacciSeries(int number) {
        int prelastNumber = 1;
        int lastNumber = 1;
        if (number > lastNumber) {
            System.out.println(prelastNumber);
        }
        while (lastNumber < number) {
            System.out.println(lastNumber);
            prelastNumber = lastNumber;
            lastNumber = lastNumber + prelastNumber;
        }
    }
}
