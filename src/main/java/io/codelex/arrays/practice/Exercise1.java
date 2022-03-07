package io.codelex.arrays.practice;

import java.util.Arrays;

public class Exercise1 {

    //TODO: Write a Java program to sort a numeric array and a string array.
    public static void main(String[] args) {

        int[] myArray1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };



        String[] myArray2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };


        System.out.print("Original numeric array: " + Arrays.toString(myArray1) + "\n");
        Arrays.sort(myArray1);
        System.out.print("Sorted numeric array: " + Arrays.toString(myArray1) + "\n\n");

        System.out.print("Original string array: " + Arrays.toString(myArray2) + "\n");
        Arrays.sort(myArray2);
        System.out.print("Sorted string array: " + Arrays.toString(myArray2) + "\n");
//

        //System.out.println("Original numeric array : " + );

        //Sort array
       // System.out.println("Sorted numeric array : " + Arrays.toString(myArray1));

        //System.out.println("Original string array : " + myArray2);

        //Sort array
        //System.out.println("Sorted string array : " + Arrays.toString(myArray2));

    }
}
