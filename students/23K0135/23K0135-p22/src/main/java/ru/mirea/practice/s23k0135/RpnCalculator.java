package ru.mirea.practice.s23k0135;

import java.util.StringTokenizer;

public class RpnCalculator {
    private Stack stack;

    public RpnCalculator(int size) {
        stack = new Stack(size);
    }

    public double evaluate(String expression) {
        StringTokenizer tokenizer = new StringTokenizer(expression);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();

            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                performOperation(token);
            }
        }

        return stack.pop();
    }

    private void performOperation(String operator) {
        double secondOperand = stack.pop();
        double firstOperand = stack.pop();

        switch (operator) {
            case "+":
                stack.push(firstOperand + secondOperand);
                break;
            case "-":
                stack.push(firstOperand - secondOperand);
                break;
            case "*":
                stack.push(firstOperand * secondOperand);
                break;
            case "/":
                if (secondOperand == 0) {
                    throw new ArithmeticException("Ошибка: Деление на ноль");
                }
                stack.push(firstOperand / secondOperand);
                break;
            default:
                throw new IllegalArgumentException("Недопустимый оператор: " + operator);
        }
    }

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
