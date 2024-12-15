package ru.mirea.practice.s0000001;

import java.util.PriorityQueue;

public abstract class Task4 {
    public static void main(String[] args) {
        PriorityQueue<Element> queue = new PriorityQueue<>();

        for (int i = 1; i <= 10; i++) {
            queue.add(new Element(i, "value" + i));
        }

        System.out.println("Extracting elements:");
        for (int i = 0; i < 3; i++) {
            System.out.println(queue.poll());
        }
    }

    private static class Element implements Comparable<Element> {
        int priority;
        String value;

        Element(int priority, String value) {
            this.priority = priority;
            this.value = value;
        }

        @Override
        public int compareTo(Element o) {
            return Integer.compare(this.priority, o.priority);
        }

        @Override
        public String toString() {
            return "Priority: " + priority + ", Value: " + value;
        }
    }
}
