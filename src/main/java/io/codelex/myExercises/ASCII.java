package io.codelex.myExercises;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String duration = in.nextLine();

        int sum = 0;
        int result = 0;

        for (int i = 0; i < duration.length(); i++) {
            sum = sum + duration.charAt(i);
            System.out.println(duration.charAt(i));
        }
        System.out.print(sum);
    }

}
