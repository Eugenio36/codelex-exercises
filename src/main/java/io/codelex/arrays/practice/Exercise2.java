package io.codelex.arrays.practice;

import java.util.Scanner;

public class Exercise2 {

    //TODO: Write a Java program to sum values of an array.
    // Array values are starting from min (including) till max (including) number.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a min number: ");
        int minNumber = input.nextInt();

        System.out.println("Please enter a max number: ");
        int maxNumber = input.nextInt();

        int myArray[];

        int sum = 0;


        for (int i = minNumber; i <= maxNumber; i++) {
            sum = sum + i;
        }

        System.out.println("The sum of numbers from " + minNumber + " and " + maxNumber + " is " + sum);
    }
}
