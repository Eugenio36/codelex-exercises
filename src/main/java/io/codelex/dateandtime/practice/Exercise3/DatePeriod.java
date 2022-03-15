package io.codelex.dateandtime.practice.Exercise3;

import java.time.LocalDate;

public class DatePeriod {
    private final LocalDate firstDate;
    private final LocalDate secondDate;

    public DatePeriod(LocalDate firstDate, LocalDate secondDate) {
        this.firstDate = firstDate;
        this.secondDate = secondDate;
    }

    public DatePeriod intersection(DatePeriod secondPeriod) {
        if (firstDate.isBefore(secondPeriod.firstDate) && secondDate.isAfter(secondPeriod.firstDate) && secondDate.isBefore(secondPeriod.secondDate)) {
            return new DatePeriod(secondPeriod.firstDate, secondDate);
        } else if (firstDate.isBefore(secondPeriod.secondDate) && secondDate.isAfter(secondPeriod.secondDate) && firstDate.isAfter(secondPeriod.firstDate)) {
            return new DatePeriod(firstDate, secondPeriod.secondDate);
        } else if (firstDate.isBefore(secondPeriod.firstDate) && secondDate.isAfter(secondPeriod.secondDate)) {
            return new DatePeriod(secondPeriod.firstDate, secondPeriod.secondDate);
        } else if (firstDate.isAfter(secondPeriod.firstDate) && secondDate.isBefore(secondPeriod.secondDate)) {
            return new DatePeriod(firstDate, secondDate);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "firstDate: " + firstDate + ", secondDate: " + secondDate;
    }
}
