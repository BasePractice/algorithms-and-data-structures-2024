package ru.mirea.practice.lab23.t3;

public class Const implements Expression {
    private final double value;

    public Const(double value) {
        this.value = value;
    }

    @Override
    public double evaluate(double x) {
        return value;
    }
}
