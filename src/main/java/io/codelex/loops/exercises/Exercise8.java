package io.codelex.loops.exercises;

public class Exercise8 {
    public static void main(String[] args) {
        asciiFigure(5);
    }

    public static void asciiFigure(int size) {
        for (int i = 0; i < size; i++) {

            int maxWidth = 8 * (size - 1);
            int stars = 8 * i;
            int slashes = (maxWidth - stars) / 2;

            for (int j = 0; j < slashes; j++) {
                System.out.print("/");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < slashes; j++) {
                System.out.print("\\");
            }
            System.out.println();
            }
        }
    }
