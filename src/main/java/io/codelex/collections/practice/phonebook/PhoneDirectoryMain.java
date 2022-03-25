package io.codelex.collections.practice.phonebook;

public class PhoneDirectoryMain {
    public static void main(String[] args) {
        PhoneDirectoryEdited phoneDirectory = new PhoneDirectoryEdited();

        phoneDirectory.putNumber("Boris", "37129637521");
        phoneDirectory.putNumber("John", "37129473521");
        phoneDirectory.putNumber("Mike", "37129304163");
        phoneDirectory.putNumber("Peter", "37129473084");
        phoneDirectory.putNumber("Andrey", "37129539874");
        phoneDirectory.putNumber("Janis", "37129539371");

        System.out.println(phoneDirectory);

        System.out.println(phoneDirectory.getNumber("Boris"));
        System.out.println(phoneDirectory.getNumber("Janis"));

    }

}
