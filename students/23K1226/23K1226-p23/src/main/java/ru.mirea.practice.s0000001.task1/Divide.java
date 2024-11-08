package ru.mirea.practice.s0000001.task1;

class Divide extends Expression {
    private Expression left;
    private Expression right;

    public Divide(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate(int x) {
        int rightValue = right.evaluate(x);
        if (rightValue == 0) {
            throw new ArithmeticException("division by zero");
        }
        return left.evaluate(x) / rightValue;
    }
}
