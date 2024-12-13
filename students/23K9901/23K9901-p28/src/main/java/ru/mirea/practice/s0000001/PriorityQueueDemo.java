package ru.mirea.practice.s0000001;

import java.util.TreeSet;

abstract class PriorityQueueDemo {
    public static void main(String[] args) {
        TreeSet<Integer> priorityQueue = new TreeSet<>();

        priorityQueue.add(15);
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(5);
        priorityQueue.add(25);
        priorityQueue.add(30);
        priorityQueue.add(1);
        priorityQueue.add(12);
        priorityQueue.add(18);
        priorityQueue.add(3);

        System.out.println("Initial priority queue:");
        System.out.println(priorityQueue);

        System.out.println("\nExtracting and displaying a few elements:");
        System.out.println("First element: " + priorityQueue.pollFirst());
        System.out.println("Next element: " + priorityQueue.pollFirst());
        System.out.println("Next element: " + priorityQueue.pollFirst());

        System.out.println("\nPriority queue after extracting elements:");
        System.out.println(priorityQueue);
    }
}
