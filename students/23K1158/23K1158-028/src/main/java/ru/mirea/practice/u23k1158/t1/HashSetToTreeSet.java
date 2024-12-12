package ru.mirea.practice.u23k1158.t1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public abstract class HashSetToTreeSet {
    public static void main(String[] args) {
        // Создание и инициализация HashSet
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(50);
        hashSet.add(20);
        hashSet.add(80);
        hashSet.add(10);
        hashSet.add(60);
        hashSet.add(30);
        hashSet.add(70);
        System.out.println("HashSet (произвольный порядок):");
        for (Integer num : hashSet) {
            System.out.print(num + " ");
        }
        // Преобразование HashSet в TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
        System.out.println("\n\nTreeSet (отсортированный):");
        for (Integer num : treeSet) {
            System.out.print(num + " ");
        }
    }
}
