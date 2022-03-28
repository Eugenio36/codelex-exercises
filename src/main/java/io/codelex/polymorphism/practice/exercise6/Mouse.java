package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {

    public Mouse(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("> Mouse is making sound!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Mice are not eating that type of food!");
        } else {
            setFoodEaten(food.getQuantity());
        }
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
