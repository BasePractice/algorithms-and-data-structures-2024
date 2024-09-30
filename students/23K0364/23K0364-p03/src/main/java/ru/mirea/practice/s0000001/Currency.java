package ru.mirea.practice.s0000001;

public class Currency {
    private String name;
    private double exchangeRateToUsd;

    public Currency(String name, double exchangeRateToUsd) {
        this.name = name;
        this.exchangeRateToUsd = exchangeRateToUsd;
    }

    public String getName() {
        return name;
    }

    public double getExchangeRateToUsd() {
        return exchangeRateToUsd;
    }
}
