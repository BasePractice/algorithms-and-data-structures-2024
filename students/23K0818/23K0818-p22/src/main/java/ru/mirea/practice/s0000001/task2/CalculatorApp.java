package ru.mirea.practice.s0000001.task2;

public abstract class CalculatorApp {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        new CalculatorController(model, view);

        view.setVisible(true);
    }
}
