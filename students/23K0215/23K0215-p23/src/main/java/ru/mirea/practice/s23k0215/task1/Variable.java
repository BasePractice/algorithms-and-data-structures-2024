package ru.mirea.practice.s23k0215.task1;


class Variable extends Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int evaluate(int x) {
        System.out.println("Evaluating variable: " + name);
        return x;
    }
}
