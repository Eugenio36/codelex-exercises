package io.codelex.dateandtime.practice.Exercise2;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Please enter information below to specify server launch date.");
        LocalDate date1 = userEnters(true);
        System.out.println();
        System.out.println("Please enter year (2022) and month (1-12) to check when you need to update server: ");
        LocalDate date2 = userEnters(false);

        System.out.println();
        System.out.println("Server launch date: " + date1);
        System.out.println();
        

        for (LocalDate date = date1; date.isBefore(date2); date = date.plusDays(14)) {
            if (date.getMonth() == date2.getMonth() && date.getYear() == date2.getYear()) {
                System.out.println("Server must be updated on " + date.getDayOfMonth() + " of " + date.getMonth() + " (" + date.getYear() + ")");
            }
        }

    }

    private static LocalDate userEnters(boolean needDay) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        System.out.println("Enter month: ");
        int month = scanner.nextInt();
        if (needDay) {
            System.out.println("Enter day: ");
            int day = scanner.nextInt();
            return LocalDate.of(year, month, day);
        } else {
            return LocalDate.of(year, month + 1, 1).minusDays(1);
        }
    }
}
