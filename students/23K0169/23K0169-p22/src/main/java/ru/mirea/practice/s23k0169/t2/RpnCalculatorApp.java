package ru.mirea.practice.s23k0169.t2;

public abstract class RpnCalculatorApp {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();

        new CalculatorController(model, view);
    }
}
