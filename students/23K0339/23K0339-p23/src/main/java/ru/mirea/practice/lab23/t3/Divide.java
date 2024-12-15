package ru.mirea.practice.lab23.t3;

public class Divide implements Expression {
    private final Expression left;
    private final Expression right;

    public Divide(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double evaluate(double x) {
        return left.evaluate(x) / right.evaluate(x);
    }
}
