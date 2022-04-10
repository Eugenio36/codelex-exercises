package io.codelex.oop.ImperialToMetric;

import java.math.BigDecimal;

public class MeasurementConverter {

    public static BigDecimal convert(ConversionType type, BigDecimal value) {
        return type.converter.convertValue(value);
    }
}
