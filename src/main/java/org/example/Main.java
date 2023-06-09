package org.example;

public class Main {
    public static void main(String[] args) {
        FibonacciSeriesTask fibonacciSeriesTask = new FibonacciSeriesTask();
        fibonacciSeriesTask.getFibonacciSeries(10);

        PrimeNumberTask primeNumberTask = new PrimeNumberTask();
        primeNumberTask.isPrimeNumber(4);

        StringPalindromeTask stringPalindromeTask = new StringPalindromeTask();
        stringPalindromeTask.isStringPalindrome("Bob");

        IntegerPalindromeTask integerPalindromeTask = new IntegerPalindromeTask();
        integerPalindromeTask.isIntegerPalindrome(10221);

        ArmstrongNumberTask armstrongNumberTask = new ArmstrongNumberTask();
        armstrongNumberTask.isArmstrongNumber(153);

        FactorialTask factorialTask = new FactorialTask();
        factorialTask.getFactorial(1);

        ReverseStringTask reverseStringTask = new ReverseStringTask();
        reverseStringTask.getReverseString("abcdefg");
    }
}