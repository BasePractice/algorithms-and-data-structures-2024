package ru.mirea.practice.s0000001.task4;

public class ExpressionParser {
    private String expression;
    private int index = 0;

    public TripleExpression parse(String expr) {
        this.expression = expr.replaceAll("\\s+", "");
        index = 0;
        return parseAddSubtract();
    }

    private char currentChar() {
        return expression.charAt(index);
    }

    private boolean hasNext() {
        return index < expression.length();
    }

    private void nextChar() {
        index++;
    }

    private TripleExpression parseAddSubtract() {
        TripleExpression result = parseMultiplyDivide();
        while (hasNext()) {
            if (currentChar() == '+') {
                nextChar();
                result = new Add(result, parseMultiplyDivide());
            } else if (currentChar() == '-') {
                nextChar();
                result = new Subtract(result, parseMultiplyDivide());
            } else {
                break;
            }
        }
        return result;
    }

    private TripleExpression parseMultiplyDivide() {
        TripleExpression result = parseUnary();
        while (hasNext()) {
            if (currentChar() == '*') {
                nextChar();
                result = new Multiply(result, parseUnary());
            } else if (currentChar() == '/') {
                nextChar();
                result = new Divide(result, parseUnary());
            } else {
                break;
            }
        }
        return result;
    }

    private TripleExpression parseUnary() {
        if (currentChar() == '-') {
            nextChar();
            return new Negate(parsePrimary());
        } else {
            return parsePrimary();
        }
    }

    private TripleExpression parsePrimary() {
        if (currentChar() == '(') {
            nextChar();
            TripleExpression result = parseAddSubtract();
            if (currentChar() == ')') {
                nextChar();
                return result;
            } else {
                throw new IllegalArgumentException("Expected closing parenthesis");
            }
        } else if (Character.isDigit(currentChar())) {
            return parseNumber();
        } else if (currentChar() == 'x' || currentChar() == 'y' || currentChar() == 'z') {
            char var = currentChar();
            nextChar();
            return new Variable(var);
        } else {
            throw new IllegalArgumentException("Unexpected character: " + currentChar());
        }
    }

    private TripleExpression parseNumber() {
        StringBuilder number = new StringBuilder();
        while (hasNext() && Character.isDigit(currentChar())) {
            number.append(currentChar());
            nextChar();
        }
        return new Const(Integer.parseInt(number.toString()));
    }
}
