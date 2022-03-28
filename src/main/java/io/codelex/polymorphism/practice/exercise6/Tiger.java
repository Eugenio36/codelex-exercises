package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Feline {


    public Tiger(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("> ROAAR!!!");

    }

    @Override
    public void eat(Food food) {
    }

    @Override
    public String toString() {
        return "["
                + getAnimalName() + ", "
                + getAnimalType() + ", "
                + getAnimalWeight() + ", "
                + getLivingRegion() + ", "
                + getFoodEaten() + "]";
    }
}
