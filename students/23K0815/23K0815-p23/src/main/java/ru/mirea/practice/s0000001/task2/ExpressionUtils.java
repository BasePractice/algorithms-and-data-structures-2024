package ru.mirea.practice.s0000001.task2;

public abstract class ExpressionUtils {
    public static Expression createExpression() {
        return new Subtract(
                new Add(
                        new Multiply(new Variable(), new Variable()),
                        new Multiply(new Const(-2), new Variable())
                ),
                new Const(1)
        );
    }
}
