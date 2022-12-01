package org.example;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args){
        Map<String, Integer> vehicles = new java.util.TreeMap<>();

        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);

        System.out.println("Total vehicles Brands : " + vehicles.size());

        for(String key : vehicles.keySet())
            System.out.println(key + " - " + vehicles.get(key));
        System.out.println();

        System.out.println("\nPrinting all values : ");

        for(Integer val : vehicles.values())
            System.out.println(val);
        System.out.println();

        vehicles.clear();

        System.out.println("After clear operation, size : " + vehicles.size());

    }
}
