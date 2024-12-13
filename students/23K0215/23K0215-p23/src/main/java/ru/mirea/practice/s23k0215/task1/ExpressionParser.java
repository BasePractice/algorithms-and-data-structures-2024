package ru.mirea.practice.s23k0215.task1;

public final class ExpressionParser {
    private ExpressionParser() {
        // Приватный конструктор для предотвращения создания экземпляров класса
    }

    public static Expression parse(String expr) {
        expr = expr.replaceAll("\\s+", "");
        return parseExpression(expr);
    }

    private static Expression parseExpression(String expr) {
        if (expr.contains("+")) {
            String[] parts = expr.split("\\+", 2);
            return new Add(parseExpression(parts[0]), parseExpression(parts[1]));
        } else if (expr.contains("-")) {
            String[] parts = expr.split("-", 2);
            return new Subtract(parseExpression(parts[0]), parseExpression(parts[1]));
        } else if (expr.contains("*")) {
            String[] parts = expr.split("\\*", 2);
            return new Multiply(parseExpression(parts[0]), parseExpression(parts[1]));
        } else if (expr.contains("/")) {
            String[] parts = expr.split("/", 2);
            return new Divide(parseExpression(parts[0]), parseExpression(parts[1]));
        } else if (expr.matches("\\d+")) {
            return new Const(Integer.parseInt(expr));
        } else {
            return new Variable(expr);
        }
    }
}
