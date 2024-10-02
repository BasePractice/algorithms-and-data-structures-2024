package ru.mirea.practice.s23k0169.format.t1;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private Map<String, Double> exchangeRates;

    public CurrencyConverter() {
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("RUB", 73.0);
    }

    public void setExchangeRate(String currency, double rate) {
        exchangeRates.put(currency, rate);
    }

    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Неверная валюта.");
        }

        double amountInUsd = amount / exchangeRates.get(fromCurrency);
        return amountInUsd * exchangeRates.get(toCurrency);
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();

        double amountInEuros = 100;
        double amountInRubles = converter.convert(amountInEuros, "EUR", "RUB");
        System.out.printf("%.2f EUR = %.2f RUB%n", amountInEuros, amountInRubles);

        double amountInUsd = converter.convert(amountInRubles, "RUB", "USD");
        System.out.printf("%.2f RUB = %.2f USD%n", amountInRubles, amountInUsd);
    }
}
