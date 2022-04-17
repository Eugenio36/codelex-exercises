package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        while (true) {
            final Scanner scanner = new Scanner(System.in);

            int numerator = 0;
            int divisor = 0;

            try {
                System.out.println("Enter the numerator: ");
                String numeratorToString = scanner.nextLine().toLowerCase();

                if (numeratorToString.charAt(0) == 'q') {
                    break;
                } else {
                    numerator = Integer.parseInt(numeratorToString);
                    System.out.println("Enter the divisor: ");
                    divisor = scanner.nextInt();

                    System.out.println(numerator + " / " + divisor + " = " + numerator / divisor + "\n");
                }
            } catch (ArithmeticException e) {
                System.out.println("You can`t divide " + numerator + " by " + divisor + "\n");
            } catch (Exception e) {
                System.out.println("You entered bad data.\nPlease try again. \n");
            }
        }
    }
}
