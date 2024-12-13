package ru.mirea.practice.s0000001.task4;

public class Variable implements TripleExpression {
    private final char name;

    public Variable(char name) {
        this.name = name;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        switch (name) {
            case 'x': return x;
            case 'y': return y;
            case 'z': return z;
            default: throw new IllegalArgumentException("Unknown variable");
        }
    }
}
