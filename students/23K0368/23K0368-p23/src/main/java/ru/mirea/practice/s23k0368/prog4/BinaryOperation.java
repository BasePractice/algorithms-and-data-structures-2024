package ru.mirea.practice.s23k0368.prog4;

abstract class BinaryOperation implements TripleExpression {
    protected final TripleExpression left;
    protected final TripleExpression right;

    public BinaryOperation(TripleExpression left, TripleExpression right) {
        this.left = left;
        this.right = right;
    }
}
