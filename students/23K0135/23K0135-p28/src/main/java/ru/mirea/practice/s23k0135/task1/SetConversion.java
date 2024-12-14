package ru.mirea.practice.s23k0135.task1;

import java.util.HashSet;
import java.util.TreeSet;

public abstract class SetConversion {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Кофе");
        hashSet.add("Чай");
        hashSet.add("Коктейль");
        hashSet.add("Сок");
        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
