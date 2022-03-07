package io.codelex.classesandobjects.exercise2;

public class Car {
    double startKilometers;
    double endKilometers;
    double liters;

    Car(double startOdo) {

        startKilometers = startOdo;
    }

    public double calculateConsumption(){

        return (endKilometers - startKilometers) / liters;
    }

    boolean gasHog(){
        return (100/calculateConsumption()) > 15;
    }

    boolean economyCar(){

        return (100/calculateConsumption()) < 5;
    }

    void fillUp(double mileage, double liters ) {
        this.endKilometers = mileage;
        this.liters = liters;
    }
}
