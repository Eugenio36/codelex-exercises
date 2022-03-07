package io.codelex.classesandobjects.exercise5;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Date myDate = new Date(9, 11, 1986);
        myDate.displayDate();

        myDate.setDay(15);
        myDate.setMonth(4);
        myDate.setYear(1999);

        myDate.displayDate();
    }
}
