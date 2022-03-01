package io.codelex.loops.exercises;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Max value? ");
        int userNumber = scanner.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 20 == 0) {
                System.out.println();
            }
        }

    }
}


