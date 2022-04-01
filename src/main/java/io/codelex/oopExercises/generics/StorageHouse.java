package io.codelex.oopExercises.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StorageHouse<T> {

    //Fix this class so that storage house can contain other types of objects not only numbers
    //Test the functionality

    List<T> items = new ArrayList<>();

    public StorageHouse(T firstItem) {
        items.add(firstItem);
    }

    public void addMoreItems(T item) {
        items.add(item);
    }

    public Optional<T> getMaybeFirstItem() {
        return items.stream().findFirst();
    }

    public void printItems() {
        items.forEach(System.out::println);
    }

}
