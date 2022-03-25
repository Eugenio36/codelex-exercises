package io.codelex.polymorphism.practice.exercise1;

public class Kia implements Car, Boost {
    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 35;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 15;
    }

    @Override
    public void startEngine() {
        System.out.println("Brr.... Kia has started engine!");
    }

    @Override
    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed += 70;
    }


}
