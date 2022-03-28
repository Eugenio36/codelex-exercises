package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();

        while (true) {

            String line1 = scanner.nextLine();
            if (line1.equals("end")) {
                break;
            }

            String[] line1Split = line1.split(" ");

            String animalType = line1Split[0];
            String animalName = line1Split[1];
            double animalWeight = Double.parseDouble(line1Split[2]);
            String livingRegion = line1Split[3];
            String catBreed = null;

            if (line1Split.length == 5) {
                catBreed = line1Split[4];
            }

            Animal animal = null;

            switch (animalType) {

                case "Cat" -> animal = new Cat(animalName, animalType, animalWeight, livingRegion, catBreed);
                case "Tiger" -> animal = new Tiger(animalName, animalType, animalWeight, livingRegion);
                case "Mouse" -> animal = new Mouse(animalName, animalType, animalWeight, livingRegion);
                case "Zebra" -> animal = new Zebra(animalName, animalType, animalWeight, livingRegion);
            }

            animals.add(animal);
            assert animal != null;
            animal.makeSound();

            String line2 = scanner.nextLine();
            String[] line2Split = line2.split(" ");

            String foodType = line2Split[0];
            int foodQuantity = Integer.parseInt(line2Split[1]);

            Food food = null;

            switch (foodType) {
                case "Vegetable" -> food = new Vegetable(foodQuantity);
                case "Meat" -> food = new Meat(foodQuantity);
            }

            animal.eat(food);

            System.out.println(animal);
        }

        System.out.println(animals);


    }


}

