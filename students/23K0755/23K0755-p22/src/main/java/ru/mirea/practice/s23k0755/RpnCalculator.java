package ru.mirea.practice.s23k0755;

public class RpnCalculator {
    private Stack stack;

    public RpnCalculator(int size) {
        stack = new Stack(size);
    }

    public double evaluate(String expression) {
        String[] strings = expression.split(" ");
        for (String element : strings) {
            try {
                float f = Float.parseFloat(element);
                stack.push(f);
            } catch (NumberFormatException e) {
                performOperation(element);
            }
        }
        return stack.pop();
    }

    private void performOperation(String operator) {
        float secondOperand = stack.pop();
        float firstOperand = stack.pop();
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
}
