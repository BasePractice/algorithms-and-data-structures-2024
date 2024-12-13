package ru.mirea.practice.s0000001.task1;

import java.util.HashSet;
import java.util.TreeSet;

public abstract class HsToTs {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hs.add(i);
        }
        TreeSet<Integer> ts = new TreeSet<>(hs);
        System.out.println(hs);
        System.out.println(ts);
        System.out.println(ts.equals(hs));
    }
}
