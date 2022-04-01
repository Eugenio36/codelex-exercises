package io.codelex.oop.Generics1;

public class Bottle<T extends Liquid> {
    private final T contents;

    public Bottle(T contents) {
        this.contents = contents;
    }

    void printOutContents() {
        System.out.println(contents.getName() + " has been poured out!");
    }


}
