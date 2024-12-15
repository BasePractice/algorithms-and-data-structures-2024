package ru.mirea.practice.s0000001.n2;

import java.util.Stack;

public class RPnModel {
    public int calculate(String exp) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = exp.split(" ");

        // Проверка на пустую строку
        if (tokens.length == 0) {
            throw new IllegalArgumentException("Выражение пустое");
        }

        try {
            for (String token : tokens) {
                if (isNumber(token)) {
                    stack.push(Integer.parseInt(token));
                } else {
                    if (stack.size() < 2) {
                        throw new IllegalArgumentException("Недостаточно операндов для операции: " + token);
                    }
                    int b = stack.pop();
                    int a = stack.pop();
                    switch (token) {
                        case "+":
                            stack.push(a + b);
                            break;
                        case "-":
                            stack.push(a - b);
                            break;
                        case "*":
                            stack.push(a * b);
                            break;
                        case "/":
                            if (b == 0) {
                                throw new ArithmeticException("Деление на ноль");
                            }
                            stack.push(a / b);
                            break;
                        default:
                            throw new IllegalArgumentException("Неизвестный оператор: " + token);
                    }
                }
            }

            if (stack.size() != 1) {
                throw new IllegalArgumentException("Некорректное выражение. Проверьте формат записи.");
            }

            return stack.pop();
        } catch (Exception e) {

            throw new RuntimeException("Ошибка вычисления: " + e.getMessage(), e);
        }
    }

    private boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
