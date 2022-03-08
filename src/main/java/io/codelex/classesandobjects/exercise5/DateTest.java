package io.codelex.classesandobjects.exercise5;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Date myDate = new Date(15, 12, 2000);
        myDate.displayDate();

        System.out.println("Making some changes. New date: ");
        myDate.setDay(15);
        myDate.setMonth(11);
        myDate.setYear(2022);
        myDate.displayDate();

    }
}
