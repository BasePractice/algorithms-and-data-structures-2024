package ru.mirea.practice.s23l0908.output_line.task1;

import java.util.HashMap;

public class Main {
    private HashMap<String, Double> exchangeRates;

    public Main() {
        exchangeRates = new HashMap<>();
        // Initialize some example exchange rates
        exchangeRates.put("USD", 1.0);  // Base currency
        exchangeRates.put("EUR", 0.85); // 1 USD = 0.85 EUR
        exchangeRates.put("GBP", 0.75); // 1 USD = 0.75 GBP
        exchangeRates.put("JPY", 110.0); // 1 USD = 110 JPY
        exchangeRates.put("VND", 23000.0); // 1 USD = 23000 VND
    }

    public void addOrUpdateRate(String currency, double rate) {
        exchangeRates.put(currency.toUpperCase(), rate);
    }

    public double convert(double amount, String fromCurrency, String toCurrency) {
        fromCurrency = fromCurrency.toUpperCase();
        toCurrency = toCurrency.toUpperCase();

        if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Unsupported currency: " + fromCurrency + " or " + toCurrency);
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
        double amountInUSD = 100.0;
        String fromCurrency = "USD";
        String toCurrency = "EUR";

        double convertedAmount = converter.convert(amountInUSD, fromCurrency, toCurrency);
        System.out.printf("%.2f %s is %.2f %s\n", amountInUSD, fromCurrency, convertedAmount, toCurrency);
        converter.addOrUpdateRate("AUD", 1.35);
        System.out.println("Added AUD exchange rate.");
        double amountInAUD = converter.convert(100, "USD", "AUD");
        System.out.printf("100 USD is %.2f AUD\n", amountInAUD);
    }
}
