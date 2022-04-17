package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> arrayList = new ArrayList<>();

        //TODO: Add 10 values to list
        arrayList.add("Pencil");
        arrayList.add("Pen");
        arrayList.add("Mouse");
        arrayList.add("Keyboard");
        arrayList.add("Monitor");
        arrayList.add("Mobile phone");
        arrayList.add("Computer");
        arrayList.add("Ring");
        arrayList.add("Lamp");
        arrayList.add("Notepad");

        System.out.println("List before changes: " + arrayList);

        //TODO: Add new value at 5th position
        arrayList.add(4, "Laptop");
        System.out.println("Added new value to 5th position: " + arrayList);

        //TODO: Change value at last position (Calculate last position programmatically)
        arrayList.set(arrayList.size() - 1, "Jacket");
        System.out.println("Changed value at last position: " + arrayList);

        //TODO: Sort your list in alphabetical order
        Collections.sort(arrayList);
        System.out.println("Sorting array in alphabetical order: " + arrayList);

        //TODO: Check if your list contains "Foobar" element
        System.out.print("Check if your list contains \"Foobar\" element: ");
        if (arrayList.contains("Foobar")) {
            System.out.println("Contains!");
        } else {
            System.out.println("Does not contain!");
        }

        //TODO: Print each element of list using loop
        System.out.print("Print each element of list using loop: ");
        for (String elements : arrayList) {
            System.out.print(elements + " ");
        }


    }

}
