package io.codelex.collections.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        List<String> arrayList = Arrays.asList(array);
        System.out.println("Arraylist: " + arrayList);


        //todo - replace array with a HashSet and print out the results
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(array));
        System.out.println("HashSet: " + hashSet);

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        HashMap<String, String> hashMapList = new HashMap<>();
        hashMapList.put("Audi", "Germany");
        hashMapList.put("BMW", "Germany");
        hashMapList.put("Honda", "Japan");
        hashMapList.put("Mercedes", "Germany");
        hashMapList.put("VolksWagen", "Germany");
        hashMapList.put("Mercedes", "Germany");
        hashMapList.put("Tesla", "USA");
        System.out.println(hashMapList);

    }
}
