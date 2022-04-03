package io.codelex.TestAdvanced.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private int basketValue = 0;
    private final List<T> basket = new ArrayList<>();


    public List<T> getBasket() {
        return basket;
    }

    public void addToBasket(T item) throws BasketFullException {
        if (basket.size() >= 10) {
            throw new BasketFullException("Basket is full");
        } else {
            basket.add(item);
            basketValue++;
        }
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        if (basket.size() == 0) {
            throw new BasketEmptyException("Basket is empty");
        } else {
            basket.remove(item);
            basketValue--;
        }
    }


}
