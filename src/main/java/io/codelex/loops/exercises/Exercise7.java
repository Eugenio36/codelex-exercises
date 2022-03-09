package io.codelex.loops.exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int points = 0;
        int total = 0;

        System.out.println("Welcome to Piglet! Roll a dice!");


        while (true) {
            int rollDice = random.nextInt(6) + 1;

            if (rollDice == 1) {
                System.out.println("You rolled a " + rollDice + "!");
                System.out.println("You got 0 points.");
                points = 0;
                System.exit(0);
            } else {
                System.out.println("Your rolled a " + rollDice + "!");
                total = total + rollDice;
                System.out.println("Roll again? y/n");
                String rollAgain = scanner.nextLine().toLowerCase();

                 if (rollAgain.equals("n") || rollAgain.equals("no")) {
                    System.out.println("Thank you for the game. You got " + total + " points.");
                     System.exit(0);
                } else if (rollAgain.equals("y") || rollAgain.equals("yes")) {
                    total = total + points;
                } else {
                     System.out.println("Wrong input! Try again!");
                 }
            }
        }
    }
}
