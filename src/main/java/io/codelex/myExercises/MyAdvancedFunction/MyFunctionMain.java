package io.codelex.myExercises.MyAdvancedFunction;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class MyFunctionMain {
    public static void main(String[] args) {

        MyAdvancedFunction<Integer> myFunction = (Integer number) -> number * 2;
        System.out.println(myFunction.calculate(10));

        doCalculations(myFunction);
        doCalculations((Integer n) -> n * 12);

        BiFunction<Integer, Integer, String> myOtherFunction = (Integer a, Integer b) -> {
            Integer result = (a + b);
            return result.toString();
        };

        UnaryOperator<Integer> multiplyByTwo = (Integer number) -> number * 2;
        UnaryOperator<Integer> plussThree = (Integer number) -> number + 3;
        UnaryOperator<Integer> plusNine = (Integer number) -> number + 9;

        Integer r = calculate(10, multiplyByTwo, plussThree, multiplyByTwo, plusNine);
        System.out.println(r);
    }

    public static void doCalculations(MyAdvancedFunction<Integer> myFunction) {
        System.out.println(myFunction.calculate(10));
    }

    public static Integer calculate(Integer number, UnaryOperator<Integer>... functions) {
        Integer result = number;
        for (UnaryOperator<Integer> function : functions) {
            result = function.apply(result);
        }
        return result;
    }
}

