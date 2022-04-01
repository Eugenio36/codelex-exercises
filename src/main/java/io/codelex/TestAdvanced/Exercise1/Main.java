package io.codelex.TestAdvanced.Exercise1;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1234, "Jevgenijs Senderovics", 0.045, 500);
        DebitCard debitCard = new DebitCard(5678, "Jevgenijs Senderovics", 0.149, 200);

        creditCard.setBalance(50);
        System.out.println(creditCard.takeMoney());

        debitCard.setBalance(15_000);
        System.out.println(debitCard.addMoney());

    }
}
