package io.codelex.oop.ImperialToMetric;

public enum ConversionType {

    METERS_TO_YARDS(new MetersToYardsConverter()),
    YARDS_TO_METERS(new YardsToMeters()),
    CENTIMETERS_TO_INCHES(new CantimetersToInches()),
    INCHES_TO_CENTIMETERS(new InchesToCantimeters()),
    KILOMETERS_TO_MILES(new KilometersToMiles()),
    MILES_TO_KILOMETERS(new MilesToKilometers());

    public Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }

}
