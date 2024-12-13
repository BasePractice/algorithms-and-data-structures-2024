package ru.mirea.practice.s0000001.task3;

public class Multiply extends BinaryOperation {

    public Multiply(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate(double x) {
        return left.evaluate(x) * right.evaluate(x);
    }
}
