package io.codelex.oop.Persons;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Peter", "Johnson", "12345", 30, "Accountant", "2015-03-03");
        System.out.println("Employee");
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Started working: " + employee.getStartedWorking());
        System.out.println("Working experience: " + employee.getWorkExperience());
        System.out.println("Information: " + employee.getInfo());
        System.out.println();

        Customer customer = new Customer("Boris", "Britva", "67890", 50, "ID.1524", "5");
        System.out.println("Customer:");
        System.out.println("First Name: " + customer.getFirstName());
        System.out.println("Last Name: " + customer.getLastName());
        System.out.println("ID: " + customer.getId());
        System.out.println("Age: " + customer.getAge());
        System.out.println("Customer ID : " + customer.getCustomerId());
        System.out.println("Purchase count : " + customer.getPurchaseCount());
        System.out.println("Information: " + customer.getInfo());

    }
}
