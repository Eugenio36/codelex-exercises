package io.codelex.classesandobjects.exercise7;

public class DogTest {
    public static void main(String[] args) {

        Dog[] dogs = new Dog[8];

        dogs[0] = new Dog("Max", "male");
        dogs[1] = new Dog("Rocky", "male");
        dogs[2] = new Dog("Sparky", "male");
        dogs[3] = new Dog("Buster", "male");
        dogs[4] = new Dog("Sam", "male");
        dogs[5] = new Dog("Lady", "female");
        dogs[6] = new Dog("Molly", "female");
        dogs[7] = new Dog("Coco", "female");

        // Dogs
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        System.out.println();

        dogs[0].assignParents(dogs[5], dogs[1]); // Max has Lady as mother, and Rocky as father
        dogs[7].assignParents(dogs[6], dogs[3]); // Coco has Molly as mother, and Buster as father
        dogs[1].assignParents(dogs[6], dogs[4]); // Rocky has Molly as mother, and Sam as father
        dogs[3].assignParents(dogs[5], dogs[2]); // Buster has Lady as mother, and Sparky as father

        // Dogs fathers
        for (Dog dog : dogs) {
            System.out.println(dog + "Dog`s father is: " + dog.fathersName());
        }

        System.out.println();
        System.out.println("Has Coco and Rocky the same mother?");
        System.out.println(dogs[7].hasSameMotherAs(dogs[1])); // true?

    }
}
