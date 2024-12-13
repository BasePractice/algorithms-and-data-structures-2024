package ru.mirea.practice.s23k0145.lab1;

public abstract class QueueTest {
    public static void main(String[] args) {
        CircularQueue<Integer> queue = new CircularQueue<>(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue);

        queue.enqueue(60);
        System.out.println(queue);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);

        queue.enqueue(70);
        System.out.println(queue);

        queue.enqueue(80);
        System.out.println(queue);

        queue.enqueue(90);
        System.out.println(queue);

        queue.dequeue();
        System.out.println(queue);
    }
}
