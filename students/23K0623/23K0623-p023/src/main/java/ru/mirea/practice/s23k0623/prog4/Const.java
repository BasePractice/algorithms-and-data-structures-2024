package ru.mirea.practice.s23k0623.prog4;

class Const implements TripleExpression {
    private final int value;

    public Const(int value) {
        this.value = value;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return value;
    }
}
