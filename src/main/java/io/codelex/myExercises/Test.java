package io.codelex.myExercises;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        String firstName = "Lewis";
        String lastName = "Carroll";
        LocalDate dateOfBirth = LocalDate.of(1832, 1, 27);
        String book1 = "Alice in Wonderland";
        String book2 = "Walrus and the Carpenter";

        //AUTHOR OBJECT CREATION:

        Author lewisCarrol = new Author(firstName, lastName, dateOfBirth);

        lewisCarrol.addBook(book1);
        lewisCarrol.addBook(book2);

        System.out.println("There are totally about " + Author.BOOKS_IN_THE_WORLD + " books in the world.");
        long age = lewisCarrol.getAge();
        System.out.println("Author's age: " + age);
        System.out.println(lewisCarrol.getFullName());
        System.out.println(lewisCarrol);
        if (lewisCarrol.hasWrittenBook("Alice in Wonderland")) {
            System.out.println("He has written the book Alice in Wonderland!");
        }
        if (lewisCarrol.hasWrittenBook("Titanic")) {
            System.out.println("He has written the book Titanic!");
        } else {
            System.out.println("He has not written the book Titanic!");
        }

        System.out.println("==============================");
        lewisCarrol.printAllInfo();

    }


}

/*

        Expected output:

        There are totally about 129864880 books in the world.
        Author's age: 190
        Lewis Carroll
        Author{firstName='Lewis', lastName='Carroll', dateOfBirth=1832-01-27, books=[Alice in Wonderland, Walrus and the Carpenter]}
        He has written the book Alice in Wonderland!
        He has not written the book Titanic!
        ==============================
        Author Lewis Carroll
        His age is 190 at the moment
        He has written 2 books

*/








