package io.codelex.classesandobjects.exercise2;

public class Car {
    double startKilometers;
    double endKilometers;
    double liters;
    public static final int gasHogLevel = 15;
    public static final int economyCarLevel = 5;

    Car(double startOdo) {
        startKilometers = startOdo;
    }

    public double calculateConsumption() {

        return (this.endKilometers - this.startKilometers) / this.liters;
    }

    boolean gasHog() {

        return (100 / calculateConsumption()) > gasHogLevel;
    }

    boolean economyCar() {

        return (100 / calculateConsumption()) < economyCarLevel;
    }

    void fillUp(double mileage, double liters) {
        this.endKilometers = mileage;
        this.liters = liters;
    }
}
