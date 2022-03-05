package io.codelex.classesandobjects.exercise2;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double startKilometers, endKilometers, liters;

        System.out.print("Enter first reading: " );
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: " );
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: " );
        liters  = scan.nextDouble();

        Car car = new Car(startKilometers);
        car.fillUp(endKilometers, liters);

        System.out.println( "Kilometers per liter are "  + car.calculateConsumption() );

        if (car.economyCar()) {
            System.out.println("This car is economy");
        } else if (car.gasHog()) {
            System.out.println("This car is a gas hog");
        }
    }
}
