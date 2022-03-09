package io.codelex.myExercises;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();


        String result = S.replaceAll("(.{5})", "$1-");

        System.out.println(result);
    }
}
