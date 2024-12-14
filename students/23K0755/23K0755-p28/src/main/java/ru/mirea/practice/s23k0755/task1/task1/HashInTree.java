package ru.mirea.practice.s23k0755.task1.task1;

import java.util.HashSet;
import java.util.TreeSet;

abstract class HashInTree {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Иванов Иван");
        hashSet.add("Михайлов Михаил");
        hashSet.add("Третий человек");
        hashSet.add("Смирнов Андрей");
        hashSet.add("Последний человек");
        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);
    }
}
