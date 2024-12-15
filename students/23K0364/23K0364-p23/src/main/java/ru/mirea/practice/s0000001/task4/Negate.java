package ru.mirea.practice.s0000001.task4;

public class Negate implements TripleExpression {
    private final TripleExpression expression;

    public Negate(TripleExpression expression) {
        this.expression = expression;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return -expression.evaluate(x, y, z);
    }
}
