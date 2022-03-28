package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Feline {

    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, double foodEaten, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
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
