package ru.mirea.practice.s23l0908.task1;

public class Stack {
    private final float[] arr;
    private int top;
    private final int capacity;

    Stack(int size) {
        arr = new float[size];
        capacity = size;
        top = -1;
    }

    public void push(float x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
            System.exit(1);
        }
        arr[++top] = x;
    }

    public float pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return arr[top--];
    }

    @SuppressWarnings("unused")
    public int getSize() {
        return top + 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    @SuppressWarnings("unused")
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
