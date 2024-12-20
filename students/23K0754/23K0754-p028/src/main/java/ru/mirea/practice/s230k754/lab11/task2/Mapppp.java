package ru.mirea.practice.s230k754.lab11.task2;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Mapppp {

    public Map createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Мельникова", "Агата");
        map.put("Волков", "Артём");
        map.put("Муратов","Артём");
        map.put("Фомина","Ксения");
        map.put("Кузнецов","Артём");
        map.put("Виноградова","Варвара");
        map.put("Мельникова","Ксения");
        map.put("Яковлев","Артём");
        map.put("Евсеев","Али");
        map.put("Мельникова","Ева");
        return map;
    }

    public int getSameFirstNameCount(@NotNull Map map) {

        HashSet<String> set = new HashSet<>(map.values());

        return (10 - set.size()) + 1;
    }

    public int getSameLastNameCount(@NotNull Map map) {
        HashSet<String> set = new HashSet<>(map.keySet());
        return (10 - set.size()) + 1;
    }
}

