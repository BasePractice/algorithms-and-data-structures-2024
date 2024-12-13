package ru.mirea.practice.s0000001;

public class Stack {
    private double[] arr;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.arr = new double[capacity];
        this.top = -1;
        this.capacity = capacity;
    }

    public void push(double data) {
        if (isFull()) {
            System.out.println("The stack is full");
            System.exit(1);
        }
        this.arr[++top] = data;
    }

    public double pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(1);
        }
        return arr[top--];
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int getTop() {
        return top;
    }
}
