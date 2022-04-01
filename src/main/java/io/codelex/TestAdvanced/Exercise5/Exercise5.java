package io.codelex.TestAdvanced.Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exercise5 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");
        double percent = partOf(names, (String name) -> name.length() > 4);
        System.out.println(percent); //Should print out 0.75 because 75% of names are longer than 4 letters

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        double evenPercent = partOf(numbers, (Integer n) -> n % 2 == 1);
        System.out.println(evenPercent); //Should print out 0.5 because 50% of numbers are even

    }

    public static <T> double partOf(List<T> list, Predicate<T> criteria) {
        long countThatMatches = list.stream().filter(criteria).count();
        return (double) countThatMatches / list.size();
    }

}
