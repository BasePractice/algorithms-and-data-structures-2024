package ru.mirea.practice.s23k1167.task1;

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
