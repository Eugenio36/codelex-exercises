package io.codelex.collections.Exercise5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = in.nextInt();

        //Loop until you don't get sum either as 1 or 4
        while (num != 1 && num != 4) {
            num = sumOfDigits(num);
        }

        if (num == 1)
            System.out.println("Happy number");
        else
            System.out.println("Not a Happy number");
    }

    //Function to return sum of square of digits
    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += Math.pow(num % 10, 2);
            num = num / 10;
        }
        return sum;
    }
}
