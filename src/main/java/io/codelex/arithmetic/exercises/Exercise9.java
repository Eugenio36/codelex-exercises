package io.codelex.arithmetic.exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        DecimalFormat decimal = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your weight in kg: ");
        double weightInKg = scanner.nextDouble();
        System.out.println("Please enter your height in cm: ");
        double heightInCm = scanner.nextDouble();

        double heightInInches = heightInCm / 2.54;
        double weightInPounds = weightInKg * 2.2046;
        double bmi = (weightInPounds * 703) / Math.pow(heightInInches, 2);


        if (bmi >= 18.5 && bmi <= 25) System.out.println("Your body mass index is: " + decimal.format(bmi) + " and your weight is optimal.");
        else if (bmi < 18.5) System.out.println("Your body mass index is: " + decimal.format(bmi) + " and have underweight.");
        else System.out.println("Your body mass index is: " + decimal.format(bmi) + " and you have overweight.");
    }
}
