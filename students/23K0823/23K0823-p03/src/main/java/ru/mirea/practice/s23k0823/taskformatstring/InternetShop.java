package ru.mirea.practice.s23k0823.taskformatstring;

import java.util.Scanner;

public abstract class InternetShop {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("Введите цену товара: ");
            double price = scanner.nextDouble();

            System.out.print("Выберите валюту (USD, EUR, GBP): ");
            String currency = scanner.next();

            double amount;
            if ("USD".equalsIgnoreCase(currency)) {
                amount = price;
            } else if ("EUR".equalsIgnoreCase(currency)) {
                amount = CurrencyConverter.convertUsdToEur(price);
            } else if ("GBP".equalsIgnoreCase(currency)) {
                amount = CurrencyConverter.convertUsdToGbp(price);
            } else {
                System.out.println("Неверная валюта. Пожалуйста, попробуйте снова.");
                return;
            }

            System.out.printf("Общая стоимость: %.2f %s%n", amount, currency);
        }
    }
}