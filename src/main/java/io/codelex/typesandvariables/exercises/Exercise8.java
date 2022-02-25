package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        int minutesInYear = 60 * 24 * 365;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");

        int minutes = scanner.nextInt();

        int years = (minutes / minutesInYear);
        int days = (minutes / 60 / 24) % 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}


