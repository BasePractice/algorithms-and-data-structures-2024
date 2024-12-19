package ru.mirea.practice.s23k0623.prog3;

public abstract class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Введите значение x, значение по умолчанию х = 1");

        }

        try {
            double x;
            if (args.length < 1) {
                x = 1;
            } else {
                x = Double.parseDouble(args[0]);
            }
            Expression expr = new Add(
                new Subtract(
                    new Multiply(new Variable("x"), new Variable("x")),
                    new Multiply(new Const(2), new Variable("x"))
                ),
                new Const(1)
            );

            double result = expr.evaluate(x);
            System.out.println("Результат: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод: введите числовое значение для x.");
        }
    }
}
