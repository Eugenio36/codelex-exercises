package io.codelex.flowcontrol.exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number for 1 to 7: ");

        int value = scanner.nextInt();

        switch (value) {
            case 1 -> System.out.println("It is Monday");
            case 2 -> System.out.println("It is Tuesday");
            case 3 -> System.out.println("It is Wednesday");
            case 4 -> System.out.println("It is Thursday");
            case 5 -> System.out.println("It is Friday");
            case 6 -> System.out.println("It is Saturday");
            case 7 -> System.out.println("It is Sunday");
            default -> System.out.println("Not a valid day");
        }
    }
}
