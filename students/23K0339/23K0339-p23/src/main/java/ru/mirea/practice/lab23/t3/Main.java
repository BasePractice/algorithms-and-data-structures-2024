package ru.mirea.practice.lab23.t3;

abstract class Main {
    public static void main(String[] args) {
        Expression expr = new Add(
            new Subtract(
                new Multiply(new Variable("x"), new Variable("x")),
                new Const(1)
            ),
            new Multiply(new Const(2), new Variable("x"))
        );
        System.out.println(expr.evaluate(5));
    }
}

