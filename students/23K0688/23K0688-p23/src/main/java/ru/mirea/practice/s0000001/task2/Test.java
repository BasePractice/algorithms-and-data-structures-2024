package ru.mirea.practice.s0000001.task2;

public abstract class Test {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        String[] strarr = {"ok","la","ko"};
        queue.setArr(strarr);
        queue.print();
        queue.enqueue("10");
        queue.print();
        System.out.println("got: " + queue.dequeue());
        queue.print();
        System.out.println("1 element:" + queue.getElement());
        System.out.println("size:" + queue.getSize());
        System.out.println("empty:" + queue.isEmpty());
        queue.clear();
        queue.print();
        System.out.println("empty:" + queue.isEmpty());
    }

}
