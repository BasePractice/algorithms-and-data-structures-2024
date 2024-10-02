package ru.mirea.practice.s23k0823.taskformatstring;

public abstract class CurrencyConverter {
    private static final double USD_TO_EUR = 0.84;
    private static final double USD_TO_GBP = 0.76;

    public static double convertUsdToEur(double amount) {
        return amount * USD_TO_EUR;
    }

    public static double convertUsdToGbp(double amount) {
        return amount * USD_TO_GBP;
    }
}