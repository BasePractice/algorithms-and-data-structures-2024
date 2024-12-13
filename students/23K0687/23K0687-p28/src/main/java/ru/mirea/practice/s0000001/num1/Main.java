package ru.mirea.practice.s0000001.num1;

import java.util.HashSet;
import java.util.TreeSet;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 10; i > 0; i--) {
            hs.add(i);
        }

        TreeSet<Integer> ts = new TreeSet<>(hs);

        System.out.println("Элементы после преобразования в TreeSet:");
        for (int val : ts) {
            System.out.println(val);
        }
    }
}
