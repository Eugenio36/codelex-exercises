package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Feline {

    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("> Meowwww");
    }

    @Override
    public void eat(Food food) {
        setFoodEaten(food.getQuantity());
    }

    @Override
    public String toString() {
        return "["
                + getAnimalName() + ", "
                + getBreed() + ", "
                + getAnimalWeight() + ", "
                + getLivingRegion() + ", "
                + getFoodEaten() + "]";
    }

}
