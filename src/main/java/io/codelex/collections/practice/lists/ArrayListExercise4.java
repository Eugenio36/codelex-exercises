package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class ArrayListExercise4 {

    public static void main(String[] args) {
        // Create a list and add some colors to the list
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        //fixme
        String element = "Orange";
        colors.add(0, element);
        System.out.println("First element: " + element);

        //fixme
        element = "Purple";
        colors.add(2, element);
        System.out.println("Third element: " + element);

    }
}
