package io.codelex.dateandtime.practice.Exercise1;

import java.time.LocalDate;

public class Exercise1 {

    private static final int WORKING_HOURS_PER_DAY = 8;

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.parse("2022-03-07");
        LocalDate date2 = LocalDate.parse("2022-03-20");

        System.out.println("First date: " + date1);
        System.out.println("Second date: " + date2);
        System.out.println("Days in general: " + overAllDays(date1, date2));
        System.out.println("Working days: " + workingDays(date1, date2));
        System.out.println("Working hours: " + workingDays(date1, date2) * WORKING_HOURS_PER_DAY);
    }


    private static int overAllDays(LocalDate date1, LocalDate date2) {
        int overAllDays = 0;
        for (LocalDate date = date1; date.isBefore(date2.plusDays(1)); date = date.plusDays(1)) {
            overAllDays++;
        }
        return overAllDays;
    }

    private static int workingDays(LocalDate date1, LocalDate date2) {
        int workingDays = 0;
        for (LocalDate date = date1; date.isBefore(date2.plusDays(1)); date = date.plusDays(1)) {
            if (isWorkingDay(date)) {
                workingDays++;
            }
        }
        return workingDays;
    }

    private static boolean isWorkingDay(LocalDate date) {
        return date.getDayOfWeek().getValue() < 6;
    }

}


