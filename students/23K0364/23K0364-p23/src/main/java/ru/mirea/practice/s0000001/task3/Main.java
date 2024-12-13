package ru.mirea.practice.s0000001.task3;

public abstract class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a value for x.");
            return;
        }

        double x = Double.parseDouble(args[0]);

        Expression expression = new Add(
            new Variable("x"),
            new Subtract(
                new Multiply(new Const(2), new Variable("x")),
                new Const(1)
            )
        );

        double result = expression.evaluate(x);
        System.out.println("Result for x = " + x + " is: " + result);
    }
}
