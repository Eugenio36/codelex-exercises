package io.codelex.classesandobjects.exercise7;

public class DogTest {
    public static void main(String[] args) {

        Dog max = new Dog("Max", Sex.MALE);
        Dog rocky = new Dog("Rocky", Sex.MALE);
        Dog sparky = new Dog("Sparky", Sex.MALE);
        Dog buster = new Dog("Buster", Sex.MALE);
        Dog sam = new Dog("Sam", Sex.MALE);
        Dog lady = new Dog("Lady", Sex.FEMALE);
        Dog molly = new Dog("Molly", Sex.FEMALE);
        Dog coco = new Dog("Coco", Sex.FEMALE);

        max.assignParents(lady, rocky);
        coco.assignParents(molly, buster);
        rocky.assignParents(molly, sam);
        buster.assignParents(lady, sparky);

        Dog[] dogs = {max, rocky, sparky, buster, sam, lady, molly, coco};

        for (Dog i : dogs) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Max`s father: " + max.fathersName());
        System.out.println("Coco`s father: " + coco.fathersName());
        System.out.println("Rocky`s father: " + sam.fathersName()); // should return Unknown
        System.out.println("Buster`s father: " + sam.fathersName() + "\n"); // should return Unknown

        System.out.println("Has Coco and Rocky the same mother? " + coco.hasSameMotherAs(rocky));
        System.out.println("Has Max and Coco the same mother? " + max.hasSameMotherAs(coco));

    }
}
