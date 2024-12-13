package ru.mirea.practice.lab23.t3;

public class Variable implements Expression {

    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public double evaluate(double x) {
        return x;
    }

    public String getName() {
        return name;
    }
}
