package ru.mirea.practice.s23k0120.task1;

import ru.mirea.practice.s23k0120.task1.utilclasses.Number;
import ru.mirea.practice.s23k0120.task1.utilclasses.Operation;

import java.util.Stack;

public class Calculator {
    private final Stack<ComputingElement> stack;

    public Calculator() {
        this.stack = new Stack<>();
    }

    public void clear() {
        stack.clear();
    }

    public void addNumber(Number number) {
        stack.push(number);
    }

    public void addOperation(Operation operation) {
        stack.push(operation);
    }

    public Stack<ComputingElement> getStack() {
        return stack;
    }

    public Number compute() {
        Number result = new Number();
        Number b;
        Number a;


        ComputingElement popped = stack.pop();
        if (popped instanceof Operation) {
            b = compute();
            a = compute();
            result = ((Operation) popped).compute(a, b);
        } else if (popped instanceof Number) {
            result = (Number) popped;
        }

        return result;
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
