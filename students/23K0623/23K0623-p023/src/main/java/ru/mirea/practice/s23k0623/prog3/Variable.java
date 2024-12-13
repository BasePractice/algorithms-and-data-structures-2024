package ru.mirea.practice.s23k0623.prog3;

class Variable implements Expression {
    @SuppressWarnings("PMD.SingularField")
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public double evaluate(double x) {
        return x;
    }
}
