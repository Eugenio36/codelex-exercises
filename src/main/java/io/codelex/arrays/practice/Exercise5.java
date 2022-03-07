package io.codelex.arrays.practice;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Exercise5 {

    //TODO: Write a Java program to find the index of an array element.
    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int valueOfNumber36 = 36;
        int valueOfNumber29 = 29;

        int indexOfElement36 = -1;
        int indexOfElement29 = -1;


        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == valueOfNumber36) {
                indexOfElement36 = i;
            } else if (myArray[i] == valueOfNumber29) {
                indexOfElement29 = i;
                break;
            }
        }

        System.out.println("Index position of 36 is: " + indexOfElement36);
        System.out.println("Index position of 29 is: " + indexOfElement29);


        //Expected output:
        //Index position of 36 is: 4
        //Index position of 29 is: 8
        
        /*
        fixme
        System.out.println("Index position of 36 is: " + indexOfElement36);
        System.out.println("Index position of 29 is: " + indexOfElement29);
        */
    }
}
