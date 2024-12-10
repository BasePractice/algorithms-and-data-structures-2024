package ru.mirea.practice.s23k0215.task1;

class Subtract extends Expression {
    private Expression left;
    private Expression right;

    public Subtract(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate(int x) {
        return left.evaluate(x) - right.evaluate(x);
    }
}
