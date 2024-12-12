package ru.mirea.practice.s0000001.task4;

public abstract class Main {
    public static void main(String[] args) {
        ExpressionParser parser = new ExpressionParser();
        TripleExpression expr = parser.parse("1000000*x*x*x*x*x/(x-1)");

        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println(i + " " + expr.evaluate(i, 0, 0));
            } catch (ArithmeticException e) {
                System.out.println(i + " division by zero");
            } catch (Exception e) {
                System.out.println(i + " overflow");
            }
        }
    }
}
