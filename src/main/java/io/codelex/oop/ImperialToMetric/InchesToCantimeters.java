package io.codelex.oop.ImperialToMetric;

import java.math.BigDecimal;

public class InchesToCantimeters extends UnitConverter {
    @Override
    protected BigDecimal getCoefficient() {
        return new BigDecimal("2.54");
    }
}
