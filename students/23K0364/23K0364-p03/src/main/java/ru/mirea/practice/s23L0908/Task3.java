package ru.mirea.practice.s23L0908;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public abstract class Task3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            final Product[] products = {
                new Product("Laptop", 1200),
                new Product("Smartphone", 800),
                new Product("Headphones", 150),
                new Product("Smartwatch", 250)
            };

            final Map<String, Currency> currencies = new HashMap<>();
            currencies.put("USD", new Currency("USD", 1.0));
            currencies.put("EUR", new Currency("EUR", 0.85));
            currencies.put("RUB", new Currency("RUB", 75.0));

            System.out.println("Добро пожаловать в интернет-магазин!");
            System.out.println("Доступные товары:");

            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + ". " + products[i].getName() + " - $" + products[i].getPriceInUsd());
            }

            System.out.print("Выберите товар (введите номер): ");
            int productIndex = scanner.nextInt() - 1;
            final Product selectedProduct = products[productIndex];

            System.out.print("Введите количество товара: ");
            int quantity = scanner.nextInt();

            System.out.println("Выберите валюту для оплаты (USD, EUR, RUB): ");
            String currencyCode = scanner.next().toUpperCase(Locale.ROOT);

            Currency selectedCurrency = currencies.get(currencyCode);
            if (selectedCurrency == null) {
                System.out.println("Неверная валюта.");
                return;
            }

            double totalPriceInUsd = selectedProduct.getPriceInUsd() * quantity;
            double totalPriceInSelectedCurrency = totalPriceInUsd * selectedCurrency.getExchangeRateToUsd();

            System.out.printf("Итоговая стоимость: %.2f %s\n", totalPriceInSelectedCurrency, selectedCurrency.getName());
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
