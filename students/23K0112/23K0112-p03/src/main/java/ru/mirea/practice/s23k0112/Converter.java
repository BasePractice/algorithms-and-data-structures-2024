package ru.mirea.practice.s23k0112;

public class Converter {
    double amount; // Made the amount field private

    public Converter() {
        this.amount = 0; // Initialize amount to 0
    }

    public double convertRubToUsd(double amount) {
        return amount * 0.0108;
    }

    public double convertRubToCny(double amount) {
        return amount * 0.14;
    }

    public double convertUsdToRub(double amount) {
        return amount * 92.58;
    }

    public double convertUsdToCny(double amount) {
        return amount * 7.05;
    }

    public double convertCnyToRub(double amount) {
        return amount * 13.04;
    }

    public double convertCnyToUsd(double amount) {
        return amount * 0.14;
    }
}