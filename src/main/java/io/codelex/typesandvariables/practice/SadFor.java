package io.codelex.typesandvariables.practice;

import io.codelex.NoCodeWrittenException;

public class SadFor {
    public static void main(String[] args) {
        System.out.println(test1());
    }

    public static int test1() {

        try {
            int i;
            for (i = 0; i < 10; i++) {
                if (Math.sqrt(i) > 2.5) // šeit mazliet nav skaidrs, jo pirmais "i" skaitlis, kam kvadrātsakne < par 2.5 ir nulle. ja mainīt kodu tā, lai būtu > 2.5, tad pirmais i skaitlis ir 7
                    break;
            }
            return i;
        } catch (Exception e) {
            throw new NoCodeWrittenException();
        }
    }
}
