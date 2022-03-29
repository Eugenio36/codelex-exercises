package io.codelex.myExercises.fibonacci;

import io.codelex.fibonacci.FibonacciSequence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciSequenceTest {

    @Test
    void testFirstNumbers() {
        //GIVEN
        FibonacciSequence sequence = new FibonacciSequence();
        int firstNumberToGet = 1;
        int secondNumberToGet = 2;
        int thirdNumberToGet = 3;
        int fourthNumberToGet = 5;

        int expectedFirst = 0;
        int expectedSecond = 1;
        int expectedThird = 1;
        int expectedFourth = 3;

        //WHEN - THEN
        Assertions.assertEquals(expectedFirst, sequence.getNumber(firstNumberToGet));
        Assertions.assertEquals(expectedSecond, sequence.getNumber(secondNumberToGet));
        Assertions.assertEquals(expectedThird, sequence.getNumber(thirdNumberToGet));
        Assertions.assertEquals(expectedFourth, sequence.getNumber(fourthNumberToGet));
    }


    @Test
    void testLaterNumbers() {
        FibonacciSequence sequence = new FibonacciSequence();

        Assertions.assertEquals(55, sequence.getNumber(11));
        Assertions.assertEquals(89, sequence.getNumber(12));
        Assertions.assertEquals(144, sequence.getNumber(13));
    }

    @Test
    void testIncorrectIndex() {
        FibonacciSequence sequence = new FibonacciSequence();
        Exception e = Assertions.assertThrows(IllegalStateException.class, () -> sequence.getNumber(-3));
        Assertions.assertEquals("Incorrect index", e.getMessage());
        System.out.println(e.getMessage());
    }
}
