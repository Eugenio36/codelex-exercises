package io.codelex.dateandtime.practice.Exercise1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise1 {


    public static void main(String[] args) {

        LocalDate date1 = LocalDate.parse("2022-03-07");
        LocalDate date2 = LocalDate.parse("2022-03-20");

        // Loop to count days in general
        int days = 0;
        for (LocalDate date = date1; date.isBefore(date2.plusDays(1)); date = date.plusDays(1)) {
            days++;
        }

        // Loop to count only working days.
        int count = 0;
        for (LocalDate date = date1; date.isBefore(date2.plusDays(1)); date = date.plusDays(1)) {
            if (getDayNumber(date) != 6 && getDayNumber(date) != 7) {
                count++;
            }
        }

        int workingHours = count * 8;

        System.out.println("First date: " + date1);
        System.out.println("Second date: " + date2);
        System.out.println("Days in general: " + days);
        System.out.println("Working days: " + count);
        System.out.println("Working hours: " + workingHours);
    }

    public static int getDayNumber(LocalDate date) {
        DayOfWeek day = date.getDayOfWeek();
        return day.getValue();
    }
}


