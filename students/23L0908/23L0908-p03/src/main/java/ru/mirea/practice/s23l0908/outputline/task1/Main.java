package ru.mirea.practice.s23l0908.outputline.task1;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Main {
    private final Map<String, Double> exchangeRates;

    public Main() {
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.75);
        exchangeRates.put("JPY", 110.0); // 1 USD = 110 JPY
        exchangeRates.put("VND", 23000.0); // 1 USD = 23000 VND
    }

    public void addOrUpdateRate(String currency, double rate) {
        exchangeRates.put(currency.toUpperCase(Locale.ROOT), rate);
    }

    public double convert(double amount, String fromCurrency, String toCurrency) {
        fromCurrency = fromCurrency.toUpperCase(Locale.ROOT);
        toCurrency = toCurrency.toUpperCase(Locale.ROOT);

        if (!exchangeRates.containsKey(fromCurrency)) {
            throw new IllegalArgumentException("Unsupported currency: " + fromCurrency);
        }
        if (!exchangeRates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Unsupported currency: " + toCurrency);
        }

        double baseAmount = amount / exchangeRates.get(fromCurrency);
        return baseAmount * exchangeRates.get(toCurrency);
    }

    public void printExchangeRates() {
        System.out.println("Exchange Rates (Base: USD):");
        for (String currency : exchangeRates.keySet()) {
            System.out.println(currency + ": " + exchangeRates.get(currency));
        }
    }

    public static void main(String[] args) {
        Main converter = new Main();
        converter.printExchangeRates();

        double amountInUsd = 100.0;
        String fromCurrency = "USD";
        String toCurrency = "EUR";

        double convertedAmount = converter.convert(amountInUsd, fromCurrency, toCurrency);
        System.out.printf("%.2f %s is %.2f %s\n", amountInUsd, fromCurrency, convertedAmount, toCurrency);

        converter.addOrUpdateRate("AUD", 1.35);
        System.out.println("Added AUD exchange rate.");

        double amountInAud = converter.convert(100, "USD", "AUD");
        System.out.printf("100 USD is %.2f AUD\n", amountInAud);

    }
}
