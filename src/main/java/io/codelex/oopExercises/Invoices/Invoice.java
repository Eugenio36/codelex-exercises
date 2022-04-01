package io.codelex.oopExercises.Invoices;

public class Invoice {

    private Order order;
    private String invoiceNumber;
    private InvoiceStatus status = InvoiceStatus.APPROVED;

    public Invoice(Order order, String invoiceNumber) {
        this.order = order;
        this.invoiceNumber = invoiceNumber;
    }

    public void send() {
        status = InvoiceStatus.SENT;
    }

    public void displayInvoice() {
        System.out.println("===================================================");
        System.out.printf("= INVOICE NUMBER: %s                          =\n", invoiceNumber);
        System.out.printf("= STATUS: %s                                =\n", status);
        order.display();
        System.out.printf("= SUM: %.2f EUR                                  =\n", order.sumOfItems());
        System.out.printf("= VAT (21%%): %.2f EUR                             =\n", order.vatValue());
        System.out.printf("= TOTAL: %.2f EUR                                =\n", order.totalValue());
        System.out.println("===================================================");
    }
}
