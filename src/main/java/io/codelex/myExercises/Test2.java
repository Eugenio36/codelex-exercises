package io.codelex.myExercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class Test2 {
    public static void main(String[] args) {

        BiConsumer<String, List<String>> biConsumer = (s, strings) -> {
            if (strings.contains(s)) {
                System.out.println(s + " is present in the list");
            } else {
                System.out.println(s + " is not present in the list");
            }
        };

        biConsumer.accept("delhi", Arrays.asList("china", "delhi", "austria", "india"));
    }
}










