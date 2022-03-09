package io.codelex.classesandobjects.exercise3;

public class Main {
    public static void main(String[] args) {

        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer(200, fuelGauge);

        for (int i = 0; i < FuelGauge.MAX_LITERS; i++) {
            fuelGauge.addLiters();
        }

        while (fuelGauge.getLiters() > 0) {

            odometer.addMileage();

            System.out.println("Mileage: " + odometer.getMileage());
            System.out.println("Fuel level: " + fuelGauge.getLiters() + " liters");
            System.out.println("---------------");
        }
    }
}
