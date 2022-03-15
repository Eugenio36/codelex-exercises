package io.codelex.myExercises;

import java.text.ParseException;

public class Test2 {
    public static void main(String[] args) throws ParseException {

        int[] array = {10, 3, 450};
        int size = array.length;
        int temp;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {

                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }

        System.out.println(array[size - 2]);
    }
}










