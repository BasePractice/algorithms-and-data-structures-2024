package ru.mirea.practice.s23k0135.task2;

class CalculatorModel {
    private double result;
    public String expression = "";

    public void appendDigit(String digit) {
        expression += digit;
    }

    public void appendOperator(String operator) {
        expression += operator;
    }

    public double calculate() {
        // Basic calculation (replace with robust expression evaluation for a real calculator)
        try { // Added space after try
            result = evaluateExpression(expression);
            expression = String.valueOf(result);
        } catch (NumberFormatException e) {
            result = 0; // Handle error gracefully. In real calculator, display error message.
        }
        return result;

    }


    private double evaluateExpression(String expression) {
        // This is a VERY simplified example! It only handles simple arithmetic.
        String[] parts = expression.split("\\+|-|\\*|/|=");
        double val1 = Double.parseDouble(parts[0]);
        double val2 = parts.length > 1 ? Double.parseDouble(parts[1]) : 0;
        if (expression.contains("+")) { // Added braces
            return val1 + val2;
        }
        if (expression.contains("-")) { // Added braces
            return val1 - val2;
        }
        if (expression.contains("*")) { // Added braces
            return val1 * val2;
        }
        if (expression.contains("/")) {
            if (val2 == 0) { // Added braces
                throw new ArithmeticException("Division by zero");
            }
            return val1 / val2;
        }
        return val1; //if no operation, return value as is.
    }

    public void clear() {
        expression = "";
        result = 0;
    }

    public String getExpression() {
        return expression;
    }

    public double getResult() {
        return result;
    }
}
