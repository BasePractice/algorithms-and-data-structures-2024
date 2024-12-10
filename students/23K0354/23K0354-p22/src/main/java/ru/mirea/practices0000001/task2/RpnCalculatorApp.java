package ru.mirea.practices0000001.task2;

public abstract class RpnCalculatorApp {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();

        new CalculatorController(model, view);
    }
}