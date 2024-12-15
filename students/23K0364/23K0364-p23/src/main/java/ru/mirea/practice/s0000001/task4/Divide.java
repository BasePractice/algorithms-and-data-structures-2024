package ru.mirea.practice.s0000001.task4;

public class Divide implements TripleExpression {
    private final TripleExpression left;
    private final TripleExpression right;

    public Divide(TripleExpression left, TripleExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        int rightValue = right.evaluate(x, y, z);
        if (rightValue == 0) {
            throw new ArithmeticException("division by zero");
        }
        return left.evaluate(x, y, z) / rightValue;
    }
}
