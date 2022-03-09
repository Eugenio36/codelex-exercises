package io.codelex.loops.exercises;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter min number: ");
        int min = scanner.nextInt();
        System.out.println("Please enter max number: ");
        int max = scanner.nextInt();

        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for (int j = min; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
