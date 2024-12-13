package ru.mirea.practice.s23k0368.prog2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Metods {
    public Map<String, String> createMap() {
        Map<String, String>  map = new HashMap<>();
        map.put("Колесников","Иван");
        map.put("Гребенкин","Олег");
        map.put("Татарченков","Сергей");
        map.put("Киримецких","Вадим");
        map.put("Повторяющийся","Иван");
        map.put("Клейменов","Александр");
        map.put("Шамрай","Владислав");
        map.put("Кузнецов","Даниил");
        map.put("Тимофеев","Всеволод");
        map.put("Филонов","Егор");
        return map;
    }

    public int getSameFirstNamecount(Map<String, String> map) {
        Set<String> firstName = new HashSet<>();
        Set<String> duplicate = new HashSet<>();

        for (String elem : map.values()) {
            if (!firstName.add(elem)) {
                duplicate.add(elem);
            }
        }
        return duplicate.size();
    }

    public int getSameLastNamecount(Map<String, String> map) {
        Set<String> lastNames = new HashSet<>();
        Set<String> duplicate = new HashSet<>();

        for (String elem : map.keySet()) {
            if (!lastNames.add(elem)) {
                duplicate.add(elem);
            }
        }
        return duplicate.size();
    }
}
