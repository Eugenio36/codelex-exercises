package io.codelex.polymorphism.practice.exercise3;

public class Exercise3Main {
    public static void main(String[] args) {
        Student student = new Student("Boris", "Britva", "Indenpendence str. 12", 37, 5.2);
        Employee employee = new Employee("Peter", "Ozols", "Elizabetes iela 5", 16, "Programmer");

        System.out.println(student.display());
        System.out.println(employee.display());
    }
}
