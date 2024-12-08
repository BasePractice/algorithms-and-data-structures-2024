package ru.mirea.practice.s23k0368.prog3;

import java.util.PriorityQueue;

public abstract class Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(5);
        priorityQueue.add(10);
        priorityQueue.add(1);
        priorityQueue.add(30);
        priorityQueue.add(25);

        System.out.println("Очередь с приоритетами:" + priorityQueue);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
