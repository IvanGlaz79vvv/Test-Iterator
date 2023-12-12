package org.example;

import org.apache.commons.collections4.MapIterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    String key;
    int value;
    public static void main(String[] args) {

        //write your code here
        String Alpha = "Alpha";
        String Gamma = "Gamma";
        String Omega = "Omega";

        TreeMap<String, Integer> map = new TreeMap<>();

        map.put(Alpha, 1);
        map.put(Gamma, 3);
        map.put(Omega, 24);

        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
//        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            int value = entry.getValue();
//            System.out.println(key + " " + value);
            System.out.println(map);
//        }
    }

    @Override
    public String toString() {
        return "{" + key + " = " + value + "}";
    }
}