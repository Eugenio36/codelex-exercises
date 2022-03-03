package io.codelex.arrays.practice;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Exercise3 {

    //TODO: Write a Java program to calculate the average value of array elements.
    public static void main(String[] args) {

        DecimalFormat decimal = new DecimalFormat("0.00");

        int[] numbers = {20, 30, 25, 35, -16, 60, -100};


        // fixme - calculate sum of all array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }

        // fixme - calculate average value
        double average = (double) sum / numbers.length;

        System.out.println("Your array: " + Arrays.toString(numbers) + "." + "\n\nSum of the array elements is: "+ sum + ".");
        System.out.println("Average value of the array elements is : " + decimal.format(average) + ".");


    }
}
