package io.codelex.arrays.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise8 {

    public static void guess(String word, int life) {

        char[] filler = new char[word.length()];
        int i = 0;
        while (i< word.length()) {
            filler[i] = '-';
            if (word.charAt(i) == ' ') {
                filler[i] = ' ';
            }
            i++;
        }
        System.out.println(filler);
        System.out.println("Life remaining: " + life);
        System.out.println();


        Scanner scanner = new Scanner(System.in); // to read character from user
        ArrayList<Character> list = new ArrayList<Character>();

        while(life > 0) {
            System.out.println("Please enter to letter: ");
            char x = scanner.next().charAt(0);  // character input by user

            if (list.contains(x)) {
                System.out.println("Already entered");
                continue;
            }

            list.add(x);

            if (word.contains(x+"")) {                         // this loop will check all indexes for the
                for (int y=0; y < word.length(); y++) {        // character and will replace '-' by
                    if (word.charAt(y) == x) {                 // the character
                        filler[y] = x;
                    }
                }
            } else {
                life--;  // life decreases if entered character is not in the word
            }

            if (word.equals(String.valueOf(filler))) {   //checking if filler == word, if yes, you won
                System.out.println(filler);
                System.out.println("You won! The secret word was: " + word);
                break;
            }

            System.out.println(filler);
            System.out.println("Life remaining: " + life);
            System.out.println();
        }

        if (life == 0) {
            System.out.println("You lose!");
        }

    }


    public static void main(String[] args) {

        System.out.println("Hello! Try to guess the word!");
        String word = "destination"; // word to be guessed
        int life = 6; // number of chances
        guess(word, life);
    }

    }

