package io.codelex.TestAdvanced.Exercise2;

public class Main {
    public static void main(String[] args) throws BasketFullException, BasketEmptyException {

        Basket<Apple> basketApple = new Basket<>();
        Basket<Mushroom> basketMushroom = new Basket<>();

        Apple apple = new Apple();

//        basketApple.addToBasket(apple);
//        basketApple.removeFromBasket(apple);
//        basketApple.removeFromBasket(apple);

        basketApple.addToBasket(new Apple());
        basketApple.addToBasket(new Apple());
        basketApple.addToBasket(new Apple());
        basketApple.addToBasket(new Apple());
        basketApple.addToBasket(new Apple());
        basketApple.addToBasket(new Apple());
        basketApple.addToBasket(new Apple());
        basketApple.addToBasket(new Apple());
        basketApple.addToBasket(new Apple());
        basketApple.addToBasket(new Apple());
        basketApple.addToBasket(new Apple());
        basketApple.addToBasket(new Apple());
        basketApple.addToBasket(new Apple());
        basketApple.addToBasket(new Apple());
        basketApple.addToBasket(new Apple());
    }
}
