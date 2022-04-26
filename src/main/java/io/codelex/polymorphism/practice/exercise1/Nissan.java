package io.codelex.polymorphism.practice.exercise1;

public class Nissan implements Car {

    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 25;
    }

    @Override
    public void slowDown() {
        currentSpeed += 6;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Brr.... Nissan has started engine!");
    }

    @Override
    public Integer getCurrentSpeed() {
        return currentSpeed;
    }
}
