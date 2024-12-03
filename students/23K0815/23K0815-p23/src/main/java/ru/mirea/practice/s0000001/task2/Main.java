package ru.mirea.practice.s0000001.task2;

public abstract class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Пожалуйста, укажите значение x в командной строке.");
            return;
        }

        double x = Double.parseDouble(args[0]);
        Expression expression = ExpressionUtils.createExpression();
        double result = expression.evaluate(x);
        System.out.println("Результат: " + result);
    }
}