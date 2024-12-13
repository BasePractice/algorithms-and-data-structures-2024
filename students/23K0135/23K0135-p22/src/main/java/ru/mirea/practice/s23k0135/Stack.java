package ru.mirea.practice.s23k0135;

import java.util.EmptyStackException;

public class Stack {
    private int maxSize;
    private double[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new double[maxSize];
        this.top = -1;
    }

    public void push(double value) {
        if (top >= maxSize - 1) {
            throw new StackOverflowError("Стек переполнен");
        }
        stackArray[++top] = value;
    }

    public double pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    public double peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
