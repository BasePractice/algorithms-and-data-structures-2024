package ru.mirea.practice.s23k0087.formatting;

public class Converter {
    double amount;

    public Converter() {
        this.amount = 0;
    }

    public static double convertRubToUsd(double amount) {
        return amount * 0.010581;
    }

    public static double convertUsdToRub(double amount) {
        return amount * 94.51;
    }

    public static double convertRubToCny(double amount) {
        return amount * 0.074675;
    }

    public static double convertCnyToRub(double amount) {
        return amount * 13.39;
    }

    public static double convertUsdToCny(double amount) {
        return amount * 7.02;
    }

    public static double convertCnyToUsd(double amount) {
        return amount * 0.142509;
    }
}
