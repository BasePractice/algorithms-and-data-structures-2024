package ru.mirea.practice.s0000001;

import java.util.HashSet;
import java.util.TreeSet;

public final class Ex1 {

    private Ex1() {
        // Merry Christmas
    }

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Абрикос");
        hashSet.add("Банан");
        hashSet.add("Дыня");
        hashSet.add("Слива");

        System.out.println("Original HashSet: " + hashSet);

        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("TreeSet (sorted order): " + treeSet);
    }

}
