package ru.mirea.practice.s0000001.task3;

public class Variable implements Expression {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public double evaluate(double x) {
        System.out.println("Evaluating variable: " + name);
        return x;
    }
}

