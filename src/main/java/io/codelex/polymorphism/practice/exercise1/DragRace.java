package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        Nissan nissan = new Nissan();
        Kia kia = new Kia();
        Lexus lexus = new Lexus();
        Audi audi = new Audi();
        Bmw bmw = new Bmw();
        Tesla tesla = new Tesla();

        List<Car> cars = new ArrayList<>();
        cars.add(nissan);
        cars.add(kia);
        cars.add(lexus);
        cars.add(audi);
        cars.add(bmw);
        cars.add(tesla);

        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                for (Car c : cars) {
                    if (c instanceof Boost) {
                        ((Boost) c).useNitrousOxideEngine();
                    }
                }
            }
        }

        Car fastestCar = null;
        int fastestSpeed = 0;

        for (Car c : cars) {
            if (c.getCurrentSpeed() > fastestSpeed) {
                fastestCar = c;
                fastestSpeed = c.getCurrentSpeed();
            }
        }

        assert fastestCar != null;
        System.out.println("Fastest car: " + fastestCar.getClass().getSimpleName());
        System.out.println("Fastest speed: " + fastestSpeed);


    }
}
