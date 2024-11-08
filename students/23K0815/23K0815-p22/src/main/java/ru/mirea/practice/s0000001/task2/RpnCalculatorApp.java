package ru.mirea.practice.s0000001.task2;

public abstract class RpnCalculatorApp {
    public static void main(String[] args) {
        // Create instances of the model and view
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();

        // Create the controller
        new CalculatorController(model, view);
    }
}