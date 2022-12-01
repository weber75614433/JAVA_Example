package org.example;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMap_Example {
    public static void main(String[] args){
        Map<String, Integer> vehicles = new java.util.concurrent.ConcurrentHashMap<>();

        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);

        System.out.println("Total vehicles Brands : " + vehicles.size());

        for(String key : vehicles.keySet())
            System.out.println(key + " - " + vehicles.get(key));
        System.out.println();

        String searchKey = "Audi";
        if(vehicles.containsKey(searchKey))
            System.out.println("Found total " + vehicles.get(searchKey) + " - "
                    + searchKey + "'s cars\n");

        Integer val = (Integer) vehicles.putIfAbsent("Audi", 9);
        if(val != null)
            System.out.println("Audi was found in the map and its value was updated !");

        val = (Integer) vehicles.putIfAbsent("Nissan", 9);
        if(val == null)
            System.out.println("Nissan wasn't found in map, thus a new pair was created !");
        System.out.println();

        vehicles.clear();

        System.out.println("After clear operation, size : " + vehicles.size());


    }

}
