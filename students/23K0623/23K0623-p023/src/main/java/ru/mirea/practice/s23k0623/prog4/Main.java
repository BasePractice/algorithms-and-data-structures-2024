package ru.mirea.practice.s23k0623.prog4;

public abstract class Main {
    public static void main(String[] args) {
        ExpressionParser parser = new ExpressionParser();
        TripleExpression expression = parser.parse("1000000 * x * x * x * x * x / (x - 1)");

        for (int x = 0; x <= 10; x++) {
            try {
                int result = expression.evaluate(x, 0, 0);
                System.out.println(x + " " + result);
            } catch (EvaluationException e) {
                System.out.println(x + " " + e.getMessage());
            }
        }
    }
}
