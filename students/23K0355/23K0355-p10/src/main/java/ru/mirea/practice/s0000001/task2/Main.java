package ru.mirea.practice.s0000001.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class Main {

    private Main() {}

    public static void main(String[] args) {
        List<Students> l1 = new ArrayList<>();
        l1.add(new Students("Иван", 3.5));
        l1.add(new Students("Мария", 4.2));

        List<Students> l2 = new ArrayList<>();
        l2.add(new Students("Петр", 2.8));
        l2.add(new Students("Анна", 3.9));

        System.out.println("Первый список студентов:");
        for (Students s : l1) {
            System.out.println(s);
        }

        System.out.println("\nВторой список студентов:");
        for (Students s : l2) {
            System.out.println(s);
        }

        List<Students> mergedList = new ArrayList<>(l1);
        mergedList.addAll(l2);

        Collections.sort(mergedList, new Comparator<Students>() {
            @Override
            public int compare(Students s1, Students s2) {
                return Double.compare(s2.getG(), s1.getG());
            }
        });

        System.out.println("\nОбъединенный и отсортированный список студентов:");
        for (Students s : mergedList) {
            System.out.println(s);
        }
    }
}