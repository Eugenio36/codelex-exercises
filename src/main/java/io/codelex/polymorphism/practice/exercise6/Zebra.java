package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {

    public Zebra(String animalName, String animalType, double animalWeight, double foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("> Zebra is making sound!");
    }

    @Override
    public void eat(Food food) {
    }

    public String toString() {
        return "["
                + getAnimalName() + ", "
                + getAnimalType() + ", "
                + getAnimalWeight() + ", "
                + getLivingRegion() + ", "
                + getFoodEaten() + "]";
    }
}
