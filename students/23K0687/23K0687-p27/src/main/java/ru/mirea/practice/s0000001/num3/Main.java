package ru.mirea.practice.s0000001.num3;

import java.util.PriorityQueue;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 10; i > 0; i--) {
            pq.add(i);
        }

        System.out.println("Извлекаем несколько элементов:");
        for (int i = 0; i < 5; i++) {
            System.out.println(pq.poll());
        }
    }
}
