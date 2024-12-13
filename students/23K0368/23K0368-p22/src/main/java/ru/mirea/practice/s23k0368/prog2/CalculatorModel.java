package ru.mirea.practice.s23k0368.prog2;

import java.util.Stack;

// Model
class CalculatorModel {
    public String evaluateRpn(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split("\\s+");

        try {
            for (String token : tokens) {
                switch (token) {
                    case "+":
                        stack.push(stack.pop() + stack.pop());
                        break;
                    case "-":
                        double subtrahend = stack.pop();
                        stack.push(stack.pop() - subtrahend);
                        break;
                    case "*":
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case "/":
                        double divisor = stack.pop();
                        if (divisor == 0) {
                            return "Ошибка: деление на ноль.";
                        }
                        stack.push(stack.pop() / divisor);
                        break;
                    default:
                        stack.push(Double.parseDouble(token));
                        break;
                }
            }
            if (stack.size() != 1) {
                return "Ошибка: неверное выражение.";
            }
            return "Результат: " + stack.pop();
        } catch (Exception e) {
            return "Ошибка: неверное выражение или операция для пустого стека.";
        }
    }
}
