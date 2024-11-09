package ru.mirea.practice.s0000001.task1;

public abstract class ArrayQueueModuleTest {
    public static void main(String[] args) {
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);

        System.out.println(ArrayQueueModule.dequeue()); // 1
        System.out.println(ArrayQueueModule.element());  // 2
        System.out.println(ArrayQueueModule.size());     // 2

        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.isEmpty()); // true
    }
}

