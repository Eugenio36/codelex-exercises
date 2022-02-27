package io.codelex.typesandvariables.practice;

import java.text.DecimalFormat;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name;
        String eyes;
        String teeth;
        String hair;
        int age;
        int height;
        int weight;
        double heightCm;
        double weightKg;

        name = "Zed A. Shaw";
        age = 35;
        height = 74;
        weight = 180;
        heightCm = height * 2.54;
        weightKg = weight / 2.205;
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";

        DecimalFormat decimal = new DecimalFormat("0.00");

        System.out.println("Let's talk about " + age + ".");
        System.out.println("He's " + height + " inches tall.");
        System.out.println("He's " + weight + " pounds heavy.");
        System.out.println("He's " + decimal.format(heightCm) + " cm tall.");
        System.out.println("He's " + decimal.format(weightKg) + " kg heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + height + ", and " + weight
                + " I get " + (age + height + weight) + ".");
    }
}