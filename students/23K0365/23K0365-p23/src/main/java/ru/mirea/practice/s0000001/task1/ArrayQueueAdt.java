package ru.mirea.practice.s0000001.task1;

public class ArrayQueueAdt {
    private Object[] consists;
    private int head;
    private int tail;
    private int size;
    private int leng;

    public ArrayQueueAdt(int one) {
        leng = one;
        consists = new Object[leng];
        head = 0;
        tail = 0;
        size = 0;
    }


    public boolean isEmpty(ArrayQueueAdt tester) {
        return tester.size == 0;
    }

    private boolean isFull(ArrayQueueAdt tester) {
        return tester.size == tester.leng;
    }

    public int size(ArrayQueueAdt tester) {
        return tester.size;
    }

    public void clear(ArrayQueueAdt tester) {
        tester.consists = new Object[tester.consists.length];
        tester.head = 0;
        tester.tail = 0;
        tester.size = 0;
    }

    public void enqueue(ArrayQueueAdt tester, Object one) {
        if (isFull(tester)) {
            System.out.println("FULL");
            return;
        }
        tester.consists[tester.tail] = one;
        tester.tail = (tester.tail + 1) % tester.consists.length;
        tester.size++;
    }

    public Object elment(ArrayQueueAdt tester) {
        if (isEmpty(tester)) {
            return null;
        }
        return tester.consists[tester.head];
    }

    public Object dequeue(ArrayQueueAdt tester) {
        if (isEmpty(tester)) {
            return null;
        }
        Object temp = tester.consists[tester.head];
        tester.head = (tester.head + 1) % tester.consists.length;
        tester.size--;
        return temp;
    }

    public static void main(String[] args) {
        ArrayQueueAdt tester = new ArrayQueueAdt(6);
        tester.enqueue(tester, 12);
        tester.enqueue(tester, "1");
        tester.enqueue(tester, true);
        System.out.println(tester.isEmpty(tester));
        System.out.println(tester.size(tester));
        System.out.println(tester.dequeue(tester));
        System.out.println(tester.elment(tester));
        System.out.println(tester.dequeue(tester));
        System.out.println(tester.dequeue(tester));
        System.out.println(tester.isEmpty(tester));
        tester.clear(tester);
        System.out.println(tester.elment(tester));
    }
}
