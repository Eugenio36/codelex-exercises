package io.codelex.classesandobjects.exercise3;

public class Main {
    public static void main(String[] args) {

        FuelGauge fuel = new FuelGauge();
        Odometer odometer = new Odometer(0, fuel);

        for (int i = 0; i < FuelGauge.MAX_LITERS; i++) {
            fuel.addLiters();
        }

        while (fuel.getLiters() > 0) {

            odometer.addMileage();

            System.out.println("Mileage: " + odometer.getMileage());
            System.out.println("Fuel level: " + fuel.getLiters() + " liters");
            System.out.println();
        }
    }
}
