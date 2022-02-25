package io.codelex.typesandvariables.exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DecimalFormat decimal = new DecimalFormat("0.00000000");

        System.out.println("Input distance in meters: ");
        double meters = scanner.nextDouble();

        System.out.println("Input time spent in Hours:");
        double hours = scanner.nextDouble();

        System.out.println("Input time spent in Minutes:");
        double minutes = scanner.nextDouble();

        System.out.println("Input time spent in Seconds:");
        double seconds = scanner.nextDouble();

        double totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        double MetersPerSecond = meters / totalSeconds;

        double KilometersPerHour = (meters * 3600d) / (totalSeconds * 1000d);

        double MilesPerHour = KilometersPerHour / 1.609d;

        System.out.println("Your speed in meters/second is: " + decimal.format(MetersPerSecond));
        System.out.println("Your speed in km/h: " + decimal.format(KilometersPerHour));
        System.out.println("Your speed in miles/h is: " + decimal.format(MilesPerHour));


        scanner.close();
    }
}


/*

Test Data
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output :
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804

 */