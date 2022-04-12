package io.codelex.collections.practice.phonebook;

public class PhoneDirectoryMain {
    public static void main(String[] args) {
        PhoneDirectoryEdited phoneDirectory = new PhoneDirectoryEdited();

        phoneDirectory.putNumber("Boris", "111");
        phoneDirectory.putNumber("John", "222");
        phoneDirectory.putNumber("Mike", "333");
        phoneDirectory.putNumber("Peter", "444");
        phoneDirectory.putNumber("Andrey", "555");
        phoneDirectory.putNumber("Janis", "666");
        System.out.println(phoneDirectory + "\n");


        System.out.println(phoneDirectory.getNumber("Boris"));
        System.out.println(phoneDirectory.getNumber("Janis"));
        System.out.println(phoneDirectory.getNumber("Peter"));
        System.out.println(phoneDirectory.getNumber("Jevgenijs"));

    }

}
