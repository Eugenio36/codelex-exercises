package io.codelex.arithmetic.exercises;

public class Exercise4 {
    public static void main(String[] args) {

        int startNumber = 1;
        int endNumber = 10;
        int sum = 1;


        for (int i = startNumber; i <= endNumber; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }

}

