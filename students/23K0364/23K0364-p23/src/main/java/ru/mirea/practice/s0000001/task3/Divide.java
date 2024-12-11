package ru.mirea.practice.s0000001.task3;

public class Divide extends BinaryOperation {

    public Divide(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate(double x) {
        double rightValue = right.evaluate(x);
        if (rightValue == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return left.evaluate(x) / rightValue;
    }
}
