package ru.mirea.practice.s23k0140.task2;

public abstract class Main {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        new CalculatorController(view, model);
    }
}