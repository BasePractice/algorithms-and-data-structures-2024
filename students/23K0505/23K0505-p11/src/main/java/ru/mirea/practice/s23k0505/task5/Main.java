package ru.mirea.practice.s23k0505.task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {
        List<Float> arrayList = new ArrayList<Float>();
        List<Float> linkedList = new LinkedList<Float>();

        int size = 10000000;
        for (int i = 0; i < size; i++) {
            arrayList.add((float) i);
            linkedList.add((float) i);
        }

        long startTime = System.currentTimeMillis();
        arrayList.add(size / 2, 1.41421356237f);
        long estTime = System.currentTimeMillis() - startTime;
        System.out.printf("ArrayList insert: %d\n", estTime);

        startTime = System.currentTimeMillis();
        linkedList.add(size / 2, 1.41421356237f);
        estTime = System.currentTimeMillis() - startTime;
        System.out.printf("LinkedList insert: %d\n", estTime);

        startTime = System.currentTimeMillis();
        arrayList.remove(size / 2);
        estTime = System.currentTimeMillis() - startTime;
        System.out.printf("ArrayList remove: %d\n", estTime);

        startTime = System.currentTimeMillis();
        linkedList.remove(size / 2);
        estTime = System.currentTimeMillis() - startTime;
        System.out.printf("LinkedList remove: %d\n", estTime);

        startTime = System.currentTimeMillis();
        arrayList.get(size - 1);
        estTime = System.currentTimeMillis() - startTime;
        System.out.printf("ArrayList get: %d\n", estTime);

        startTime = System.currentTimeMillis();
        linkedList.get(size - 1);
        estTime = System.currentTimeMillis() - startTime;
        System.out.printf("LinkedList get: %d\n", estTime);

        startTime = System.currentTimeMillis();
        arrayList.contains((float) size - 1);
        estTime = System.currentTimeMillis() - startTime;
        System.out.printf("ArrayList contains: %d\n", estTime);

        startTime = System.currentTimeMillis();
        linkedList.contains((float) size - 1);
        estTime = System.currentTimeMillis() - startTime;
        System.out.printf("LinkedList contains: %d\n", estTime);

        startTime = System.currentTimeMillis();
        arrayList.sort(new Comparator<Float>() {
            @Override
            public int compare(Float o1, Float o2) {
                return Float.compare(o1, o2);
            }
        });
        estTime = System.currentTimeMillis() - startTime;
        System.out.printf("ArrayList sort: %d\n", estTime);

        startTime = System.currentTimeMillis();
        linkedList.sort(new Comparator<Float>() {
            @Override
            public int compare(Float o1, Float o2) {
                return Float.compare(o1, o2);
            }
        });
        estTime = System.currentTimeMillis() - startTime;
        System.out.printf("LinkedList sort: %d\n", estTime);
    }
}
