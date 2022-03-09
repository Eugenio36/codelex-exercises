package io.codelex.classesandobjects.exercise1;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Logitech mouse", 70.00, 14);
        Product product2 = new Product("iPhone 5s", 999.99, 3);
        Product product3  = new Product("Epson EB-U05", 440.46, 1);

        product1.setAmount(23);
        product2.setPrice(1500.99);
        product3.setPrice(339.99);

        System.out.println("First product: " + product1);
        System.out.println("Second product: " + product2);
        System.out.println("Third product: " + product3);
    }
}
