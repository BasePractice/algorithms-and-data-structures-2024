package ru.mirea.practice.s0000001;

class Stack {
    private double[] arr;
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new double[size];
        capacity = size;
        top = -1;
    }

    public void push(double x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
            System.exit(1);
        }
        arr[++top] = x;
    }

    public double pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return arr[top--];
    }

    public int getSize() {
        return top + 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }
}
