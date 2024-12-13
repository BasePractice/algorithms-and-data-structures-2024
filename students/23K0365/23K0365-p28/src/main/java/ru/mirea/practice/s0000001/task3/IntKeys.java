package ru.mirea.practice.s0000001.task3;

import java.util.HashMap;

public abstract class IntKeys {
    public static void main(String[] args) {
        HashMap<Integer, String> intK = new HashMap<>();
        intK.put(0, "Vera");
        intK.put(1, "Alex");
        intK.put(2, "Egor");
        intK.put(3, "Sergey");
        intK.put(4, "Sergey");
        intK.put(5, "Vladimir");
        intK.put(6, "Ilia");
        System.out.println(intK);
        for (int i = 6; i > 0; i--) {
            System.out.println(intK.get(i));
        }
    }
}
