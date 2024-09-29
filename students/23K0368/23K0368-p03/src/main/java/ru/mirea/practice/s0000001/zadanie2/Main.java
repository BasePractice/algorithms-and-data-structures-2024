package ru.mirea.practice.s0000001.zadanie2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private final Map<String, Double> table;

    public Main() {
        table = new HashMap<>();
        table.put("RUS", 1.0);
        table.put("USD", 90.93);
        table.put("EUR", 100.8);
        table.put("GBP", 118.93);
    }

    public double convert(Double summ, String tmpCurrency, String newCurrency) {
        if (!table.containsKey(tmpCurrency) || !table.containsKey(newCurrency)) {
            throw new IllegalArgumentException("Неверные коды валют.");
        }

        return (summ * table.get(tmpCurrency)) / table.get(newCurrency);
    }

    public static void main(String[] args) {
        Main table1 = new Main();
        System.out.println("Валюты на выбор: " + table1.table);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Введите сумму");
            double summ = sc.nextDouble();
            System.out.println("Введите исходную валюту");
            String tmpCurrency = sc.next();
            System.out.println("Введите конечную валюту");
            String newCurrency = sc.next();


            double newSumm = table1.convert(summ, tmpCurrency, newCurrency);
            System.out.println(summ + " " + tmpCurrency + " = " + newSumm + " " + newCurrency);
        }
    }
}
