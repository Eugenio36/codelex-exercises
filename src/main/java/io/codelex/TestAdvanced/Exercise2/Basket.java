package io.codelex.TestAdvanced.Exercise2;

import java.util.HashMap;
import java.util.Map;

public class Basket<T1, T2> {
    private int basketValue = 0;
    private final Map<T1, T2> basket = new HashMap<>();

    public Basket() {
    }

    public int getBasketValue() {
        return basketValue;
    }

    public void addToBasket(T1 key, T2 item) throws BasketFullException {
        if (basketValue > 10) {
            throw new BasketFullException("Basket is full");
        } else {
            basket.put(key, item);
            basketValue++;
        }
    }


    public void removeFromBasket(T1 key) throws BasketEmptyException {
        if (basketValue == 0) {
            throw new BasketEmptyException("Basket is empty");
        } else {
            basket.remove(key);
            basketValue--;
        }
    }


}
