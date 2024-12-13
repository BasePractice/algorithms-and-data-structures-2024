package ru.mirea.practice.s0000001.num1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        int n = 100000;

        long t1;
        long t2;

        List<Integer> al = new ArrayList<>();
        t1 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            al.add(i);
        }
        t2 = System.nanoTime();
        System.out.println("Время добавления в ArrayList: " + (t2 - t1));

        t1 = System.nanoTime();
        al.remove(n / 2);
        t2 = System.nanoTime();
        System.out.println("Время удаления из ArrayList: " + (t2 - t1));

        t1 = System.nanoTime();
        al.get(n / 2);
        t2 = System.nanoTime();
        System.out.println("Время поиска в ArrayList: " + (t2 - t1));

        List<Integer> ll = new LinkedList<>();
        t1 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            ll.add(i);
        }
        t2 = System.nanoTime();
        System.out.println("Время добавления в LinkedList: " + (t2 - t1));

        t1 = System.nanoTime();
        ll.remove(n / 2);
        t2 = System.nanoTime();
        System.out.println("Время удаления из LinkedList: " + (t2 - t1));

        t1 = System.nanoTime();
        ll.get(n / 2);
        t2 = System.nanoTime();
        System.out.println("Время поиска в LinkedList: " + (t2 - t1));
    }
}
