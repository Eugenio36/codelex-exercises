package io.codelex.loops.exercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first word: ");
        String first = scanner.nextLine();
        System.out.println("Please enter second word: ");
        String second = scanner.nextLine();

        System.out.print(first);

        int maxStringLength = 30;

        int dotQuantity = maxStringLength - first.length() - second.length();

        for (int i = 0; i < dotQuantity; ++i) {
            System.out.print(".");
        }

        System.out.println(second);
    }
}
