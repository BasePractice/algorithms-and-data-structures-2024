package ru.mirea.practice.s23k0368.prog4;

class Multiply extends BinaryOperation {
    public Multiply(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x, int y, int z) throws EvaluationException {
        int leftValue = left.evaluate(x, y, z);
        int rightValue = right.evaluate(x, y, z);
        if (leftValue > 0 && rightValue > 0 && leftValue > Integer.MAX_VALUE / rightValue
            || leftValue > 0 && rightValue < 0 && rightValue < Integer.MIN_VALUE / leftValue
            || leftValue < 0 && rightValue > 0 && leftValue < Integer.MIN_VALUE / rightValue
            || leftValue < 0 && rightValue < 0 && leftValue < Integer.MAX_VALUE / rightValue) {
            throw new EvaluationException("overflow");
        }
        return leftValue * rightValue;
    }
}
