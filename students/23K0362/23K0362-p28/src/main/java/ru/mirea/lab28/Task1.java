package ru.mirea.lab20;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Преобразовать структуру данных HashSet в структуру TreeSet
 */

public class Task1 {
    public static void main(String[] args) {
        Set<String> hashSet =  new HashSet<>();
        hashSet.add("Example1");
        hashSet.add("Example2");
        hashSet.add("Example3");
        System.out.println(hashSet);

        Set<String> treeSet = new TreeSet<>(hashSet);

        System.out.println(treeSet);
    }
}
