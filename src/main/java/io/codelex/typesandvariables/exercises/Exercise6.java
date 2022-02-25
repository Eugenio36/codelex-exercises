package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        int number;
        int digit;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter any Number: ");
        number = scanner.nextInt();

        while(number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        System.out.println("Sum of the digits of Given Number = " + sum);
    }
}

/*
Example:
User entered number 543

First iteration:
Reminder = 543 % 10 = 3 (last digit)
Sum = 0 + 3 = 3
Number = Number / 10, so number becomes 54.

Second iteration:
Reminder 54 % 10 = 4 (last digit)
Sum = 3 + 4 = 7
Number becomes 5.

Third iteration:
Reminder 5 % 10 = 5
Sum = 7 + 5 = 12
Number becomes 0, after that the while loop condition will fail.
 */