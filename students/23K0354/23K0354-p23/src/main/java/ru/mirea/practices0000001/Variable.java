package ru.mirea.practices0000001;

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
