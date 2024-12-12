package ru.mirea.practice.lab28.t2;

//Первое задание отсутствует ввиду того, что pmd не пропускает импорт TreeSet и HashSet, что делает невыполнимой нашу задачу


import java.util.Map;

public abstract class Main {
    public static void main(String[] args) {
        Map<String, String> nameMap = NameCounter.createMap();
        System.out.println("Одинаковые имена: " + NameCounter.getSameFirstNameCount(nameMap));
        System.out.println("Одинаковые фамилии: " + NameCounter.getSameLastNameCount(nameMap));
    }
}


