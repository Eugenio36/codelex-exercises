package io.codelex.oopExercises.generics;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer<>("Printer prints.");
        System.out.println(printer.getThingToPrint());

        System.out.println("--------------------------");
        StorageHouse storage = new StorageHouse<>("Item 1");
        storage.addMoreItems("Item 2");
        storage.addMoreItems("Item 3");
        storage.getMaybeFirstItem();
        storage.printItems();

        System.out.println("--------------------------");
        System.out.println(Combiner.combineTwoItems(45, 17.33));
    }
}
