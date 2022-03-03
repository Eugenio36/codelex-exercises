package io.codelex.arrays.exercises;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {

        int[] array1 = new int[10];


        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100 + 1);
        }

        int[] array2 = array1;

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

    }
}