package io.codelex.classesandobjects.exercise3;

public class Odometer {
    public final double MAX_MILEAGE = 999.999;
    public final int KPL = 10; // The car’s fuel economy is 10 kilometers per liter
    private double initialMileage;
    private double mileage;
    private FuelGauge fuelGauge;

    public Odometer(int mileage, FuelGauge fuelGauge) {
        this.initialMileage = mileage;
        this.mileage = mileage;
        this.fuelGauge = fuelGauge;
    }

    public double getMileage() {
        return mileage;
    }

    public void addMileage() {

        if (mileage < Math.floor(MAX_MILEAGE)) {
            mileage++;
        } else {
            mileage = 0;
        }

        double driven = initialMileage - mileage;
        if (driven % KPL == 0) {
            fuelGauge.burnFuel();
        }
    }
}
