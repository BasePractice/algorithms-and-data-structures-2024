package ru.mirea.practice.s23k0690;

import java.util.HashMap;
import java.util.Map;

public class Task1format {
    private Map<String, Double> obmen;

    public Task1format() {
        obmen = new HashMap<>();
        obmen.put("RUB", 0.01);
        obmen.put("EUR", 1.0);
        obmen.put("USD", 0.9);
    }

    public void add(String currency, double rate) {
        obmen.put(currency, rate);
    }

    public double convert(String cur, String tocur, double a) {
        if (!obmen.containsKey(cur) || !obmen.containsKey(tocur)) {
            throw new IllegalArgumentException("Неверная валюта");
        }
        double inusd = a / obmen.get(cur);
        return inusd * obmen.get(tocur);
    }

    public static void main(String[] args) {
        Task1format converter = new Task1format();
        double amountIneur = converter.convert("EUR", "RUB", 100);
        double amountInusd = converter.convert("USD", "RUB", 100);
        System.out.println("100 RUB в EUR: " + amountIneur);
        System.out.println("100 RUB в USD: " + amountInusd);
    }
}