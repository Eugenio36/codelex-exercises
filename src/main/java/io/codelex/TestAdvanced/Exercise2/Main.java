package io.codelex.TestAdvanced.Exercise2;

public class Main {
    public static void main(String[] args) throws BasketFullException, BasketEmptyException {

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Apple apple7 = new Apple();
        Apple apple8 = new Apple();
        Apple apple9 = new Apple();
        Apple apple10 = new Apple();
        Apple apple11 = new Apple();


        Basket<Integer, Apple> basketList = new Basket<>();

        try {
            basketList.addToBasket(1, apple1);
            basketList.addToBasket(2, apple1);
            basketList.addToBasket(3, apple1);
            basketList.addToBasket(4, apple1);
            basketList.addToBasket(5, apple1);
            basketList.addToBasket(6, apple1);
            basketList.addToBasket(7, apple1);
            basketList.addToBasket(8, apple1);
            basketList.addToBasket(9, apple1);
            basketList.addToBasket(10, apple1);
            basketList.addToBasket(11, apple1);
        } catch (BasketFullException e) {
            System.out.println("Problem has occurred: " + e);
        }
    }
}
