package ru.mirea.practice.s23k0823.task1.task1.task2;

public abstract class Main {
    public static void main(String[] args) {
        RpnCalculatorView view = new RpnCalculatorView();
        RpnCalculatorModel model = new RpnCalculatorModel();
        new RpnCalculatorController(view, model);
    }
}


