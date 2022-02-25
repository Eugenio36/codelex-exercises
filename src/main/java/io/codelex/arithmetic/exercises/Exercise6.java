package io.codelex.arithmetic.exercises;

public class Exercise6 {
    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 110;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.println("CozaLozaWoza");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" CozaLoza");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print(" LozaWoza");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print(" CozaWoza");
            } else if (i % 3 == 0) {
                System.out.print(" Coza");
            } else if (i % 5 == 0) {
                System.out.print(" Loza");
            } else if (i % 7 == 0) {
                System.out.print(" Woza");
            } else {
                System.out.print(" " + i);
            }
            if (i % 11 == 0) {
                System.out.println();
            }
        }

    }
}
