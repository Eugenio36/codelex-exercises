package io.codelex.classesandobjects.exercise2;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first reading: " );
        double startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: " );
        double endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: " );
        double liters  = scan.nextDouble();

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
