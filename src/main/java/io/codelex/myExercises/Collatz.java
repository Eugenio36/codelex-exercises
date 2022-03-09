package io.codelex.myExercises;

import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {

        int steps = 1;

        System.out.println("Enter a number:");
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int x = n;

        while(n != 1){
            if(n % 2 == 0)
                n /= 2;
            else n = (n * 3) + 1;
            steps++;
        }

        System.out.println("It takes " + steps + " steps to reach \'1\' using the Collatz conjecture on the number " + x +" .");
    }
}
