package ru.mirea.practice.s23k0368.prog3;

class Multiply extends BinaryOperation {
    public Multiply(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate(double x) {
        return left.evaluate(x) * right.evaluate(x);
    }
}
