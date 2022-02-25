package io.codelex.typesandvariables.exercises;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        String str;
        int upperCases = 0;
        int lowerCases = 0;
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        str = scan.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upperCases++;
            }
        }
            // Display the results
            System.out.println("Tne number of uppercase letters is: " + upperCases);


    }
}