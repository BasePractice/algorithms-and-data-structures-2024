package ru.mirea.practice.s230k754.lab11.task1;

import java.util.Objects;

public class Stacks {
    private final char[] arr;
    private int top;
    private int capacity;

    public Stacks(int capacity) {
        this.capacity = capacity;
        this.arr = new char[capacity];
        this.top = -1;
    }

    private boolean isFull() {
        return Objects.equals(top,capacity - 1);
    }

    private boolean isEmpty() {
        return -1 == top;
    }

    public int getSize() {
        return top + 1;
    }

    public void push(char x) {
        if (isFull()) {
            System.out.println("Stack is full");
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            // terminates the program
            System.exit(1);
        }
        // pop element from top of stack
        return arr[top--];
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public char[] getArr() {
        return arr;
    }
}
