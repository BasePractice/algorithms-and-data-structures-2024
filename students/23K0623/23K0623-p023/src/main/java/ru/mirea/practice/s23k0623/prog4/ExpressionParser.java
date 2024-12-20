package ru.mirea.practice.s23k0623.prog4;

class ExpressionParser {
    private String expression;
    private int index;

    public TripleExpression parse(String expression) {
        this.expression = expression.replaceAll("\\s+", "");
        this.index = 0;
        return parseExpression();
    }

    private TripleExpression parseExpression() {
        TripleExpression result = parseTerm();
        while (index < expression.length()) {
            char operator = expression.charAt(index);
            if (operator == '+' || operator == '-') {
                index++;
                TripleExpression right = parseTerm();
                result = (operator == '+') ? new Add(result, right) : new Subtract(result, right);
            } else {
                break;
            }
        }
        return result;
    }

    private TripleExpression parseTerm() {
        TripleExpression result = parseFactor();
        while (index < expression.length()) {
            char operator = expression.charAt(index);
            if (operator == '*' || operator == '/') {
                index++;
                TripleExpression right = parseFactor();
                result = (operator == '*') ? new Multiply(result, right) : new Divide(result, right);
            } else {
                break;
            }
        }
        return result;
    }

    private TripleExpression parseFactor() {
        if (expression.charAt(index) == '-') {
            index++;
            return new Negate(parseFactor());
        } else if (expression.charAt(index) == '(') {
            index++;
            TripleExpression result = parseExpression();
            if (expression.charAt(index) == ')') {
                index++;
            } else {
                throw new IllegalArgumentException("Expected closing parenthesis");
            }
            return result;
        } else if (Character.isDigit(expression.charAt(index))) {
            int start = index;
            while (index < expression.length() && Character.isDigit(expression.charAt(index))) {
                index++;
            }
            int value = Integer.parseInt(expression.substring(start, index));
            return new Const(value);
        } else if (Character.isLetter(expression.charAt(index))) {
            StringBuilder varName = new StringBuilder();
            while (index < expression.length() && Character.isLetter(expression.charAt(index))) {
                varName.append(expression.charAt(index++));
            }
            return new Variable(varName.toString());
        } else {
            throw new IllegalArgumentException("Unexpected character: " + expression.charAt(index));
        }
    }
}
