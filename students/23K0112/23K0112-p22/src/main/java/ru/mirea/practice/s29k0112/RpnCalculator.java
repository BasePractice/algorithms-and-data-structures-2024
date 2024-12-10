package ru.mirea.practice.s29k0112;

public class RpnCalculator {
    private Stack stack;

    public RpnCalculator(int size) {
        stack = new Stack(size);
    }

    public double calculate(String expression) throws Exception {
        String[] tokens = expression.split(" ");

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
                        throw new ArithmeticException("Division by zero");
                    }
                    stack.push(stack.pop() / divisor);
                    break;
                default:
                    stack.push(Double.parseDouble(token));
            }
        }

        return stack.pop();
    }
}
