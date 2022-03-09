package io.codelex.chain;

public class Main {
    public static void main(String[] args) {

        Link l1 = new Link("John");
        Link l2 = new Link("Lisa");
        Link l3 = new Link("Peter");

        Chain chain = new Chain(l1);
        chain.addLink(l2);
        chain.addLink(l3);

        chain.printOut();
    }
}
