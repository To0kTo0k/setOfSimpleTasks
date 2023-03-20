package org.example;

public class Main {
    public static void main(String[] args) {
        FibonacciSeriesTask fibonacciSeriesTask = new FibonacciSeriesTask();
        fibonacciSeriesTask.getFibonacciSeries(10);

        PrimeNumberTask primeNumberTask = new PrimeNumberTask();
        primeNumberTask.isPrimeNumber(4);

        StringPalindromeTask stringPalindromeTask = new StringPalindromeTask();
        stringPalindromeTask.isStringPalindrome("Bob");
    }
}