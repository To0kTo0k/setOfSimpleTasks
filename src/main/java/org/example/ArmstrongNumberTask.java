package org.example;

public class ArmstrongNumberTask {
    void isArmstrongNumber(int number) {
        int cubesSum = 0;
        int oldNumber = number;
        int numberSize = getNumberSize(number);
        for (int i = 0; i < numberSize; i++) {
            cubesSum += cubeOfDigit(number % 10);
            number = number / 10;
        }
        if (oldNumber == cubesSum) {
            System.out.println("Number is Armstrong number");
            return;
        }
        System.out.println("Number is not Armstrong number");
    }

    private int getNumberSize(int number) {
        int size = 0;
        while (number > 0) {
            number = number / 10;
            size++;
        }
        return size;
    }

    private int cubeOfDigit(int digit) {
        return digit * digit * digit;
    }
}
