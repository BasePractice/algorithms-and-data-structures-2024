package ru.mirea.practice.s0000001.task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class Mapping {
    public static Map<String, String> createMap() {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("Pushchenko", "Alex");
        myMap.put("Qwerty", "Egor");
        myMap.put("Zikov", "Sergey");
        myMap.put("Akberdin", "Sergey");
        myMap.put("Puff", "Nutii");
        myMap.put("Hello", "Inspector!");
        myMap.put("Ivanova", "Vera");
        myMap.put("ZX103H5", "Nadezhda");
        myMap.put("Ivanova", "Olga");
        myMap.put("Familia", "Nadezhda");
        return myMap;
    }

    public static int getSameFirstNameCount(Map<String, String> map) {
        Set<String> fn = new HashSet<>();
        int cnt = 0;
        for (String name : map.values()) {
            if (!fn.add(name)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int getSameLastNameCount(Map<String, String> map) {
        Set<String> ln = new HashSet<>();
        int cnt = 0;
        for (String lastName : map.keySet()) {
            if (!ln.add(lastName)) {
                cnt++;
            }
        }
        return cnt;
    }


    public static void main(String[] args) {
        Map<String, String> myOwn = createMap();
        System.out.println("unique first name " + getSameFirstNameCount(myOwn));
        System.out.println("unique second name: " + getSameLastNameCount(myOwn));
    }
}

