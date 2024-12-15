package ru.mirea.lab20.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    2. Создайте класс Map<String, String> и добавьте десять записей, которые представляют пары (фамилия, имя).
    Проверьте, сколько людей имеют одинаковое имя или фамилию. Требования к программе:
    a) Программа не должна отображать текст на экране.
    b) Программа не должна считывать значения с клавиатуры
    c) Метод createMap () должен создать и вернуть HashMap, который имеет элементы (String, String)
     и содержит 10 записей, представляющих пары (фамилия, имя).
    d) Метод getSameFirstNameCount () должен возвращать количество людей с одинаковыми именами.
    e) Метод getSameLastNameCount () должен возвращать количество людей с одинаковой фамилией
 */

abstract class Task2 {
    public static Map<String, Student> createMap() {
        Map<String, Student> exampleMap = new HashMap<>(10);
        exampleMap.put("1", new Student(123, "Lobanov", "Jaroslav"));
        exampleMap.put("2", new Student(123, "Sidorov", "Egor"));
        exampleMap.put("3", new Student(123, "Adamov", "Maksim"));
        exampleMap.put("4", new Student(123, "Nuykin", "Daniil"));
        exampleMap.put("5", new Student(123, "Sisoenko", "Gleb"));
        exampleMap.put("6", new Student(123, "Lobanov", "Gleb"));
        exampleMap.put("7", new Student(123, "Sidorov", "Daniil"));
        exampleMap.put("8", new Student(123, "Kozlow", "Egor"));
        exampleMap.put("9", new Student(123, "Stalin", "Iosif"));
        exampleMap.put("10", new Student(123, "No", "Name"));
        return exampleMap;
    }

    public static int getSameLastNameCount(Map<String, Student> inputMap) {
        int count = 0;
        List<Student> allNames = new ArrayList<>(inputMap.values());

        int i = 0;
        int j;
        String currentName;
        while (i < allNames.size()) {
            currentName = allNames.get(i).getLastName();
            j = i + 1;
            while (j < allNames.size()) {
                if (allNames.get(j).getLastName().equals(currentName)) {
                    count++;
                    allNames.remove(j);
                } else {
                    j++;
                }
            }
            i++;
        }
        return count;
    }

    public static int getSameFirstNameCount(Map<String, Student> inputMap) {
        int count = 0;
        List<Student> allNames = new ArrayList<>(inputMap.values());

        int i = 0;
        int j;
        String currentName;
        while (i < allNames.size()) {
            currentName = allNames.get(i).getFirstName();
            j = i + 1;
            while (j < allNames.size()) {
                if (allNames.get(j).getFirstName().equals(currentName)) {
                    count++;
                    allNames.remove(j);
                } else {
                    j++;
                }
            }
            i++;
        }

        return count;
    }

    public static void main(String[] args) {
        Map<String, Student> simpleMap = createMap();
        int countEqualNames = getSameFirstNameCount(simpleMap);
        int countEqualLastNames = getSameLastNameCount(simpleMap);
    }
}
