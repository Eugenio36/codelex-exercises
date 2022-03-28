package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {

    public Mouse(String animalName, String animalType, double animalWeight, double foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("> Mouse is making sound!");
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
