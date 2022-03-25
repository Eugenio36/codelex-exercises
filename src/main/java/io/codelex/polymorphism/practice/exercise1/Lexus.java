package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements Car, Boost {

    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 8;
    }

    public void slowDown() {
        currentSpeed += 8;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void useNitrousOxideEngine() {
        currentSpeed += 30;
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public Integer getCurrentSpeed() {
        return currentSpeed;
    }
}
