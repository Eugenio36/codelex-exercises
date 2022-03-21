package io.codelex.oop.ImperialToMetric;

import java.math.BigDecimal;

public class CantimetersToInches extends UnitConverter {
    @Override
    protected BigDecimal getCoefficient() {
        return new BigDecimal("0.393700787");
    }
}
