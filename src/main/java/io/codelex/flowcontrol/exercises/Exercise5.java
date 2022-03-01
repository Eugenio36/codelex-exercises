package io.codelex.flowcontrol.exercises;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a String: ");
        String str = in.nextLine();

        int digit = 0;
        for(int i = 0; i < str.length(); i++)
        {
            switch (str.toUpperCase().charAt(i)) {
                case 'A', 'B', 'C' -> digit = 2;
                case 'D', 'E', 'F' -> digit = 3;
                case 'G', 'H', 'I' -> digit = 4;
                case 'J', 'K', 'L' -> digit = 5;
                case 'M', 'N', 'O' -> digit = 6;
                case 'P', 'Q', 'R', 'S' -> digit = 7;
                case 'T', 'U', 'V' -> digit = 8;
                case 'W', 'X', 'Y', 'Z' -> digit = 9;
            }
            System.out.print(digit);
        }
        System.out.println();
    }
}

