package ru.mirea.practice.s23k0089.task5;

public class Node {
    private int[] values;
    private int size;
    Node next;

    public Node() {
        this.values = new int[5];
        this.size = 0;
        this.next = null;
    }

    public void insert(int value) {
        if (size == 5) {  // Если массив переполнен
            if (next == null) {
                next = new Node();
            }
            next.insert(value);
            return;
        }

        int i;
        for (i = size - 1; i >= 0 && values[i] > value; i--) {
            values[i + 1] = values[i];
        }

        values[i + 1] = value;
        size++;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
        if (next != null) {
            next.print();
        }
    }
}
