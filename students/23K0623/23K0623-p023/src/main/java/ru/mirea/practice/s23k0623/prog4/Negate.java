package ru.mirea.practice.s23k0623.prog4;

class Negate implements TripleExpression {
    private final TripleExpression expression;

    public Negate(TripleExpression expression) {
        this.expression = expression;
    }

    @Override
    public int evaluate(int x, int y, int z) throws EvaluationException {
        int value = expression.evaluate(x, y, z);
        if (value == Integer.MIN_VALUE) {
            throw new EvaluationException("overflow");
        }
        return -value;
    }
}
