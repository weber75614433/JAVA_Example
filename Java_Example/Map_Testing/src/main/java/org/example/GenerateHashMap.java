package org.example;

import java.util.HashMap;
import java.util.Map;

public class GenerateHashMap {

    public static Map<String, Integer> generateMap(int size, int value) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map.put("Key" + i, value);
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, Integer> myMap = generateMap(5, 10);
        System.out.println(myMap);
    }
}
