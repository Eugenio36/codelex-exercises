package io.codelex.classesandobjects.exercise3;

public class FuelGauge {
    final static int MAX_LITERS = 70;
    private int liters;

    public FuelGauge() {
        liters = 0;
    }

    public FuelGauge(int liters) {
        if (liters <= MAX_LITERS) {
            this.liters = liters;
        } else {
            liters = MAX_LITERS;
        }
    }

    public int getLiters() {
        return liters;
    }

    public void addLiters() {
        if (liters < MAX_LITERS) {
            liters++;
        } else {
            System.out.println("Fuel is overflowing!");
        }
    }

    public void burnFuel() {
        if (liters > 0) {
            liters--;
        } else {
            System.out.println("You are out of fuel!");
        }
    }


}
