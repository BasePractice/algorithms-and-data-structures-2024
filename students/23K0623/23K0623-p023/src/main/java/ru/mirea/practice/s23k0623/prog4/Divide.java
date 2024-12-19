package ru.mirea.practice.s23k0623.prog4;

class Divide extends BinaryOperation {
    public Divide(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x, int y, int z) throws EvaluationException {
        int leftValue = left.evaluate(x, y, z);
        int rightValue = right.evaluate(x, y, z);
        if (rightValue == 0) {
            throw new EvaluationException("division by zero");
        }
        if (leftValue == Integer.MIN_VALUE && rightValue == -1) {
            throw new EvaluationException("overflow");
        }
        return leftValue / rightValue;
    }
}
