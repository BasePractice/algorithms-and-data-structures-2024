package ru.mirea.practice.s0000001.task5;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public abstract class MesureTime {
    private static final int elemCount = 100;

    private static void inserter(List<Integer> l) {
        l.add(elemCount / 2, -1);
    }

    private static void remover(List<Integer> l) {
        l.remove(elemCount / 2);
    }

    private static void adder(List<Integer> l) {
        for (int i = 0; i < elemCount; i++) {
            l.add(i);
        }
    }

    private static void finder(List<Integer> l) {
        for (int i = 0; i < elemCount; i++) {
            l.contains(i);
        }
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> lin = new LinkedList<>();
        long start = new Date().getTime();
        adder(arr);
        long startEnd = new Date().getTime();
        adder(lin);
        long end = new Date().getTime();
        System.out.println("Time of add(ArrayList): "
                + (startEnd - start)
                + "\nTime of add(LinkedList): " + (end - startEnd));
        start = new Date().getTime();
        remover(arr);
        startEnd = new Date().getTime();
        remover(lin);
        end = new Date().getTime();
        System.out.println("Time of remove(ArrayList): "
                + (startEnd - start)
                + "\nTime of remove(LinkedList): " + (end - startEnd));
        start = new Date().getTime();
        inserter(arr);
        startEnd = new Date().getTime();
        inserter(lin);
        end = new Date().getTime();
        System.out.println("Time of insert(ArrayList): "
                + (startEnd - start)
                + "\nTime of insert(LinkedList): " + (end - startEnd));
        start = new Date().getTime();
        finder(arr);
        startEnd = new Date().getTime();
        finder(lin);
        end = new Date().getTime();
        System.out.println("Time of find(ArrayList): "
                + (startEnd - start)
                + "\nTime of find(LinkedList): " + (end - startEnd));
    }
}
