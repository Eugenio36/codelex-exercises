package io.codelex.arrays.exercises;

import java.util.Scanner;

public class Exercise8 {

    private static final String[] WORDS = {
            "destination", "school", "attractive",
            "belt", "clearance", "spontaneous",
            "grimace", "leader", "executive",
            "audience", "cold", "express",
    };

    public static void main(String[] args) {
        game();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Play 'again' or 'quit'? - yes/no");
            String answer = scanner.nextLine().toLowerCase();
            if (answer.equals("yes") || answer.equals("y") || answer.equals("again") || answer.equals("a"))
                game();
            if (answer.equals("no") || answer.equals("n") || answer.equals("quit") || answer.equals("q"))
                break;
        }
    }

    private static void game() {
        Scanner scanner = new Scanner(System.in);

        String guessedLetters = "";
        String missedLetters = "";
        String randomWord = WORDS[(int) (Math.random() * WORDS.length)];

        int tries = 0;
        while (tries <= randomWord.length()) {
            printBoard(randomWord, guessedLetters, missedLetters);
            String guess = scanner.nextLine();
            if (randomWord.toUpperCase().contains(guess.toUpperCase())) {
                if (!guessedLetters.toUpperCase().contains(guess.toUpperCase())) {
                    guessedLetters += guess;
                }
            } else {
                missedLetters += guess;
                tries++;
            }
            if (playerWon(randomWord, guessedLetters)) {
                System.out.println("YOU GOT IT!");
                System.out.println("Your word is: " + randomWord);
                break;
            }
        }

        if (!playerWon(randomWord, guessedLetters)) {
            System.out.println("You have lost!");
        }
    }


    public static void printWord(String name, String guessedLetters) {
        for (char a : name.toCharArray()) {
            if (guessedLetters.toUpperCase().contains(String.valueOf(a).toUpperCase())) {
                System.out.print(a);
            } else {
                System.out.print("_");
            }
        }
        System.out.println();
    }


    public static boolean playerWon(String name, String guessedLetters) {
        boolean hasWon = true;
        for (char a : name.toCharArray()) {
            if (!guessedLetters.contains(String.valueOf(a))) {
                hasWon = false;
                break;
            }
        }
        return hasWon;
    }

    public static void printBoard(String name, String guessedLetters, String missedLetters) {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.print("Word: ");
        printWord(name, guessedLetters);
        System.out.println("Misses: " + missedLetters);
        System.out.println("Guess: ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

}

