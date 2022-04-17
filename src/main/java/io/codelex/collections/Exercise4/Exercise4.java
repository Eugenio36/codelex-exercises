package io.codelex.collections.Exercise4;

import java.util.HashSet;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> list = new HashSet<>();

        while (true) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            list.add(name);
        }
        System.out.println("Unique name list contains: " + list);
    }
}
