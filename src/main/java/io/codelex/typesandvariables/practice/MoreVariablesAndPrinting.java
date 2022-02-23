package io.codelex.typesandvariables.practice;

import java.text.DecimalFormat;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String Name;
        String Eyes;
        String Teeth;
        String Hair;
        int Age;
        int Height;
        int Weight;
        double HeightCm;
        double WeightKg;

        Name = "Zed A. Shaw";
        Age = 35;
        Height = 74;
        Weight = 180;
        HeightCm = Height * 2.54;
        WeightKg = Weight / 2.205;
        Eyes = "Blue";
        Teeth = "White";
        Hair = "Brown";

        DecimalFormat decimal = new DecimalFormat("0.00");

        System.out.println("Let's talk about " + Age + ".");
        System.out.println("He's " + Height + " inches tall.");
        System.out.println("He's " + Weight + " pounds heavy.");
        System.out.println("He's " + decimal.format(HeightCm) + " cm tall.");
        System.out.println("He's " + decimal.format(WeightKg) + " kg heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + Eyes + " eyes and " + Hair + " hair.");
        System.out.println("His teeth are usually " + Teeth + " depending on the coffee.");

        System.out.println("If I add " + Age + ", " + Height + ", and " + Weight
                + " I get " + (Age + Height + Weight) + ".");
    }
}