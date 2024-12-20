package ru.mirea.practice.s23k0135.task1;

public abstract class Tester {
    public static void main(String[] args) {
        ArrQueMod.enqueue(1);
        ArrQueMod.enqueue(2);
        ArrQueMod.enqueue(3);
        System.out.println(ArrQueMod.element());
        System.out.println(ArrQueMod.dequeue());
        System.out.println(ArrQueMod.size());
        ArrQueMod.clear();
        System.out.println(ArrQueMod.isEmpty());

        ArrQueAdt adtQueue = new ArrQueAdt();
        ArrQueAdt.enqueue(adtQueue, 1);
        ArrQueAdt.enqueue(adtQueue, 2);
        ArrQueAdt.enqueue(adtQueue, 3);
        System.out.println(ArrQueAdt.element(adtQueue));
        System.out.println(ArrQueAdt.dequeue(adtQueue));
        System.out.println(ArrQueAdt.size(adtQueue));
        ArrQueAdt.clear(adtQueue);
        System.out.println(ArrQueAdt.isEmpty(adtQueue));

        ArrQue queue = new ArrQue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.element());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        queue.clear();
        System.out.println(queue.isEmpty());
    }
}
