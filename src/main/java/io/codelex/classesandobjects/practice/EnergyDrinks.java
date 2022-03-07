package io.codelex.classesandobjects.practice;

import io.codelex.NoCodeWrittenException;

public class EnergyDrinks {
    static final int NUMBERED_SURVEYED = 12467;
    static final double PURCHASED_ENERGY_DRINKS = 0.14;
    static final double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {

        double energyDrinkers = calculateEnergyDrinkers(NUMBERED_SURVEYED);
        double preferCitrus = calculatePreferCitrus(NUMBERED_SURVEYED);

        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + energyDrinkers + " bought at least one energy drink");
        System.out.println(preferCitrus + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {
        return (int) Math.floor(NUMBERED_SURVEYED * PURCHASED_ENERGY_DRINKS);
    }

    public static double calculatePreferCitrus(int numberSurveyed) {
        return (int) Math.floor(NUMBERED_SURVEYED * PURCHASED_ENERGY_DRINKS * PREFER_CITRUS_DRINKS);
    }
}
