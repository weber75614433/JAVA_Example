package org.example;

import java.util.Map;


public class HashMap {
    public static void main(String[] args){
        Map<String, Integer> vehicles = new java.util.HashMap<>();

        //Add some vehicles
        vehicles.put("BNW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);
        vehicles.put("", null);

        System.out.println("Total vehicles Brands : " + vehicles.size());

        //Iterate over all vehicles, using the KeySet method
        for(String key : vehicles.keySet())
            System.out.println(key + " - " + vehicles.get(key));
        System.out.println();

        String searchKey = "Audi";
        if(vehicles.containsKey(searchKey))
            System.out.println("Found total " + vehicles.get(searchKey)
                    + " " + searchKey + " cars!\n");

        vehicles.clear();

        System.out.println("After clear operation, size : " + vehicles.size());


    }
}
