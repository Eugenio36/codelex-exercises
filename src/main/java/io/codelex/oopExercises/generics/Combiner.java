package io.codelex.oopExercises.generics;

public class Combiner {

    //Fix this method so it can receive two any kind of objects
    //Test the functionality

    public static <T extends Number> String combineTwoItems(T first, T second) {
        return "First item: " + first.toString() + "; Second item: " + second.toString();
    }

}
