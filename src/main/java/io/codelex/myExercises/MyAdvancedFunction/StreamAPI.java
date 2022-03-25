package io.codelex.myExercises.MyAdvancedFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> maybeNumbers = new ArrayList<>();
        maybeNumbers.add("4");
        maybeNumbers.add("5");
        maybeNumbers.add("6");
        maybeNumbers.add("7");

        UnaryOperator<Integer> multiplyByTen = (Integer n) -> n * 10;
        Predicate<Integer> filterCriteria = (Integer n) -> n > 40;

        List<Integer> integers = maybeNumbers.stream()
                .map(Integer::parseInt)
                .map(multiplyByTen)
                .filter(filterCriteria)
                .toList();
        System.out.println(integers);
    }
}
