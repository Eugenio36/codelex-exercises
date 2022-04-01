package io.codelex.TestAdvanced.Exercise3;

public class JoinerTest {
    public static void main(String[] args) {
        Joiner joiner = new Joiner("-");
        System.out.println(joiner.join(1, 2, 3, 4, 5));
    }
}
