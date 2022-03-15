package io.codelex.myExercises;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Author {
    private String firstName;
    private String lastName;
    private String fullName;
    private final LocalDate dateOfBirth;
    private String book;
    protected static long BOOKS_IN_THE_WORLD = 129864880;

    List<String> books = new ArrayList<>();

    public Author(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return 2022 - dateOfBirth.getYear();
    }

    public String getFullName() {

        return firstName + " " + lastName;
    }

    public void addBook(String book1) {

        books.add(book1);
    }

    public long BOOKS_IN_THE_WORLD() {
        return BOOKS_IN_THE_WORLD;
    }

    public boolean hasWrittenBook(String nameOfWrittenBook) {

        return books.contains(nameOfWrittenBook);
    }


    public void printAllInfo() {
        System.out.println("Author " + firstName + " " + lastName);
        System.out.println("His age is " + getAge() + " at the moment");
        System.out.println("He has written " + books.size() + " books. And these books are: ");

        for (String x : books) {
            System.out.println(x);
        }
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", book='" + books + '\'' +
                '}';
    }
}


