package ru.mirea.practice.s23k0145.lab2;

public abstract class Main {
    public static void main(String[] args) {
        RpnCalculatorView view = new RpnCalculatorView();
        RpnCalculatorModel model = new RpnCalculatorModel();
        new RpnCalculatorController(view, model);
    }
}
