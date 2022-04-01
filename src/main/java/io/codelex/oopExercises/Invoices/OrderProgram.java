package io.codelex.oopExercises.Invoices;

public class OrderProgram {
    public static void main(String[] args) {


        FoodItem milk = new FoodItem("Milk", 0.75, "2022-04-01");
        ElectronicsItem radio = new ElectronicsItem("Radio", 25, 100);
        HouseholdItem bucket = new HouseholdItem("Bucket", 5, "red");
        ItemPacking itemPacking = new ItemPacking();

        Order order = new Order();
        order.addItem(milk);
        order.addItem(radio);
        order.addItem(bucket);
        order.addItem(itemPacking);

        try {
            Invoice invoice = new Invoice(order, "INV123");

            if (order.listOfItems.size() == 0) {
                throw new WrongOrderException();
            }
            invoice.displayInvoice();

        } catch (WrongOrderException e) {
            System.out.println("Empty order!");
        }


    }
}
