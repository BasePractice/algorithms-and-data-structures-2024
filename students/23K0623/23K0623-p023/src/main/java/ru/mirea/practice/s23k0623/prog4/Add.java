package ru.mirea.practice.s23k0623.prog4;

class Add extends BinaryOperation {
    public Add(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x, int y, int z) throws EvaluationException {
        int leftValue = left.evaluate(x, y, z);
        int rightValue = right.evaluate(x, y, z);
        if (rightValue > 0 && leftValue > Integer.MAX_VALUE - rightValue
            || rightValue < 0 && leftValue < Integer.MIN_VALUE - rightValue) {
            throw new EvaluationException("overflow");
        }
        return leftValue + rightValue;
    }
}
