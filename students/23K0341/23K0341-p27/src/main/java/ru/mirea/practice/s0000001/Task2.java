package ru.mirea.practice.s0000001;

import java.rmi.NoSuchObjectException;

/**
 * Протестировать созданные функции – создать словарь из
 * 10 элементов с разными ключами (полю value можно задавать
 * произвольное значение).
 */

public abstract class Task2 {
    public static void main(String[] args) {
        Hashtab table = new Hashtab();

        table.hashtabInit();

        for (int i = 0; i < 10; i++) {
            table.hashtabAdd("val " + i, i * i);
        }

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hash: " + table.hashtabHash("val " + i));
                System.out.println("Value: " + table.hashtabLookup("val " + i));
            }
        } catch (NoSuchObjectException e) {
            System.out.println("IMPOSSIBLE HOW THIS HAPPENED DUD?");
            System.out.println(e.getMessage());
        }

        try {
            table.hashtabDelete("val 5");
        } catch (NoSuchObjectException e) {
            System.out.println(e.getMessage());
        }

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hash: " + table.hashtabHash("val " + i));
                System.out.println("Value: " + table.hashtabLookup("val " + i));
            }
        } catch (NoSuchObjectException e) {
            System.out.println(e.getMessage());
        }
    }
}
