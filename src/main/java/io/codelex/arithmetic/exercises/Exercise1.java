package io.codelex.arithmetic.exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first integer number: ");
        int x = scanner.nextInt();

        System.out.println("Enter your second integer number: ");
        int y = scanner.nextInt();

        System.out.println("The result is : " + calculate(x, y));

        scanner.close();
    }

    public static boolean calculate(int a, int b) {
        return (a == 15 || b == 15 || (a + b) == 15 || Math.abs(a - b) == 15);
    }
}
