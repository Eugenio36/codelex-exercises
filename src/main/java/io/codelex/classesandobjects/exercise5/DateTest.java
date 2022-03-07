package io.codelex.classesandobjects.exercise5;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter date: ");
        int inputDate = scanner.nextInt();
        System.out.println("Please enter month: ");
        int inputMonth = scanner.nextInt();
        System.out.println("Please enter year: ");
        int inputYear = scanner.nextInt();


        Date myDate = new Date(inputDate, inputMonth, inputYear);
        myDate.displayDate();

        myDate.setDay(15);
        myDate.setMonth(11);
        myDate.setYear(2022);
        myDate.displayDate();

    }
}
