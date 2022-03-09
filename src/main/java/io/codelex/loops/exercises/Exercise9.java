package io.codelex.loops.exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Desired sum: ");
        int userValue = scanner.nextInt();

        int firstRoll = random.nextInt(6) + 1;
        int secondRoll = random.nextInt(6) + 1;


        while (true) {
            if (userValue == firstRoll + secondRoll) {
                System.out.println(firstRoll + " and " + secondRoll + " = " + userValue);
                break;
            } else {
                System.out.println(firstRoll + " and " + secondRoll + " = " + (firstRoll + secondRoll));
                firstRoll = random.nextInt(6) + 1;
                secondRoll = random.nextInt(6) + 1;
            }
        }
    }
}
