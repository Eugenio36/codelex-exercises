package io.codelex.myExercises;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        BigDecimal a = new BigDecimal("4");
        BigDecimal b = new BigDecimal("3.7");

        BigDecimal diff = a.subtract(b);

        System.out.println(diff);
        }
    }
