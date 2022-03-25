package io.codelex.fibonacci;

public class FibonacciSequence {

    public int getNumber(int index) {
        if (index < 1) {
            throw new IllegalStateException("Incorrect index");
        }

        if (index == 1) {
            return 0;
        } else if (index == 2) {
            return 1;
        } else {
            return getNumber(index - 1) + getNumber(index - 2);
        }
    }
}

