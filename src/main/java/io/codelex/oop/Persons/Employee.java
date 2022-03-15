package io.codelex.oop.Persons;

import java.time.LocalDate;

public class Employee extends Person {
    protected String position;
    protected LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, String startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = LocalDate.parse(startedWorking);
    }

    public String getPosition() {
        return position;
    }

    public LocalDate getStartedWorking() {
        return startedWorking;
    }

    public int getWorkExperience() {
        return LocalDate.now().getYear() - startedWorking.getYear();
    }

    @Override
    public String getInfo() {
        return firstName + " " + lastName + ", " + position + " " + "(" + getWorkExperience() + " years)";
    }
}
