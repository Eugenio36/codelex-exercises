package io.codelex.oop.ImperialToMetric;

import java.math.BigDecimal;

public class ImperialToMetricApp {
    public static void main(String[] args) {

        BigDecimal valueToConvert = new BigDecimal("10.5");

        BigDecimal result = MeasurementConverter.convert(ConversionType.CENTIMETERS_TO_INCHES, valueToConvert);

        System.out.println(result);
    }
}
