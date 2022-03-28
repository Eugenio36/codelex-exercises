package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("0.#");

        List<String> animals = new ArrayList<>();

        Vegetable vegetable = new Vegetable(0);
        Meat meat = new Meat(0);

        Mouse mouse = new Mouse(null, "Mouse", 0, 0, null);
        Zebra zebra = new Zebra(null, "Zebra", 0, 0, null);
        Cat cat = new Cat(null, "Cat", 0, 0, null, null);
        Tiger tiger = new Tiger(null, "Tiger", 0, 0, null);

        System.out.println(
                "You will enter: {AnimalType} {AnimalName} " +
                        "{AnimalWeight} {AnimalLivingRegion} [{CatBreed} = Only if its cat]");


        while (true) {

            System.out.println("Enter animal type (mouse, zebra, cat, tiger) or type 'end' to quit. ");
            String animalTypeFromUser = scanner.nextLine().toLowerCase();

            System.out.println("Enter animal name: ");
            String animalNameFromUser = scanner.nextLine().toLowerCase();

            System.out.println("Enter animal weight (kg): ");
            double animalWeightFromUser = scanner.nextDouble();
            decimalFormat.format(animalWeightFromUser);

            System.out.println("Enter animal living region: ");
            String animalLivingRegionFromUser = scanner.nextLine().toLowerCase();
            scanner.nextLine();


            String breed = "";
            if (animalTypeFromUser.equals("cat")) {
                System.out.println("Enter cats breed: ");
                breed = scanner.next();
            }

            System.out.println("Enter food type (meat or vegetable): ");
            String foodTypeFromUser = scanner.next().toLowerCase();
            System.out.println("Enter food quantity: ");
            double foodQuantityFromUser = scanner.nextDouble();


            switch (animalTypeFromUser) {

                case "end":
                    break;

                case "cat":

                    cat.setAnimalName(animalNameFromUser);
                    cat.setAnimalWeight(animalWeightFromUser);
                    cat.setLivingRegion(animalLivingRegionFromUser);
                    cat.setBreed(breed);
                    cat.makeSound();
                    cat.setFoodEaten(foodQuantityFromUser);
                    animals.add(animalTypeFromUser + cat);
                    break;

                case "tiger":

                    tiger.setAnimalName(animalNameFromUser);
                    tiger.setAnimalWeight(animalWeightFromUser);
                    tiger.setLivingRegion(animalLivingRegionFromUser);

                    if (foodTypeFromUser.equals("meat")) {
                        tiger.makeSound();
                        tiger.setFoodEaten(foodQuantityFromUser);
                    } else {
                        tiger.setFoodEaten(0);
                        System.out.println("> " + animalTypeFromUser + " is not eating that type of food!");
                    }
                    animals.add(animalTypeFromUser + tiger);
                    break;

                case "zebra":

                    zebra.setAnimalName(animalNameFromUser);
                    zebra.setAnimalWeight(animalWeightFromUser);
                    zebra.setLivingRegion(animalLivingRegionFromUser);

                    if (foodTypeFromUser.equals("vegetable")) {
                        zebra.makeSound();
                        zebra.setFoodEaten(foodQuantityFromUser);

                    } else {
                        zebra.setFoodEaten(0);
                        System.out.println("> " + animalTypeFromUser + " is not eating that type of food!");
                    }
                    animals.add(animalTypeFromUser + zebra);
                    break;

                case "mouse":
                    mouse.setAnimalName(animalNameFromUser);
                    mouse.setAnimalWeight(animalWeightFromUser);
                    mouse.setLivingRegion(animalLivingRegionFromUser);

                    if (foodTypeFromUser.equals("vegetable")) {
                        mouse.makeSound();
                        mouse.setFoodEaten(foodQuantityFromUser);
                    } else {
                        mouse.setFoodEaten(0);

                        System.out.println("> " + animalTypeFromUser + " is not eating that type of food!");
                    }
                    animals.add(animalTypeFromUser + mouse);
                    break;


            }

            System.out.println(animals);
        }
    }
}

