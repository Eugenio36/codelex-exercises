package io.codelex.classesandobjects.exercise2;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {
        Car car = new Car(500);

        System.out.println("After first fill up:");
        car.fillUp(1000, 40);
        System.out.println( "Kilometers per liter are "  + car.calculateConsumption() + " km/l" + "\n");

        System.out.println("After second fill up:");
        car.fillUp(1500, 40);
        System.out.println( "Kilometers per liter are "  + car.calculateConsumption() + " km/l" + "\n");

        System.out.println("After third fill up:");
        car.fillUp(1500, 40);
        System.out.println( "Kilometers per liter are "  + car.calculateConsumption()+ " km/l" + "\n");


        if (car.economyCar()) {
            System.out.println("This car is economy");
        } else if (car.gasHog()) {
            System.out.println("This car is a gas hog");
        }
    }
}

// it kā sanāk, ka mana mašīna ir ekonomiskā :)