package io.codelex.oop.Computers;

public class ComputerTest {
    public static void main(String[] args) {
        Computer pc1 = new Computer("i7-10700", "Kingston Fury Beast Black 8GB", "Nvidia Geforce RTX 3070Ti", "Microsoft", "Dell");
        Computer pc2 = new Computer("i5-12700", "Kingston Fury Beast Black 16GB", "Nvidia Geforce RTX 1070Ti", "Microsoft", "HP");

        pc1.setCompany("Apple");
        pc1.setGraphicsCard("Nvidia Geforce 1050Ti");
        pc1.setRam("Kingston Fury Beast Black 32GB");

        pc2.setCompany("Dell");
        pc2.setGraphicsCard("Radeon™ RX 6900 XT");
        pc2.setRam("Kingston Fury Beast Black 64GB");

        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println(pc1.equals(pc2));
        System.out.println("---------------------------------------");

        Laptop laptop1 = new Laptop("i9-10700", "Kingston Fury Beast Black 16GB", "Nvidia Geforce RTX 3090Ti", "Gygabite", "Dell", "New Battery");
        Laptop laptop2 = new Laptop("i9-10700", "Kingston Fury Beast Black 16GB", "Nvidia Geforce RTX 3090Ti", "Gygabite", "Dell", "Old Battery");

        laptop2.setBatteryParameter("New Battery");
        System.out.println(laptop1);
        System.out.println(laptop2);
        System.out.println(laptop1.equals(laptop2));
    }
}
