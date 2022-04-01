package io.codelex.TestAdvanced.Exercise3;

public class Joiner {

    public static <T extends Number> String combineTwoItems(T first, T second) {
        return "First item: " + first.toString() + "; Second item: " + second.toString();
    }
}


