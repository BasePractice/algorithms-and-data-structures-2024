package ru.mirea.practice.s00000022.task2;

import ru.mirea.practice.s00000022.task1.SimpleRpnCalculator;

public class SimpleCalculatorModel {
    private double result;
    private String displayText = "";

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getDisplayText() {
        return displayText;
    }

    public void processButtonClick(String text) {
        displayText += text;
    }

    public void clear() {
        displayText = "";
    }

    public void calculateResult() {
        SimpleRpnCalculator calculator = new SimpleRpnCalculator();
        result = calculator.evaluate(displayText);
        displayText = String.valueOf(result);
    }

    public void calculate(String expression) {
        SimpleRpnCalculator calculator = new SimpleRpnCalculator();
        result = calculator.evaluate(expression);
    }
}
