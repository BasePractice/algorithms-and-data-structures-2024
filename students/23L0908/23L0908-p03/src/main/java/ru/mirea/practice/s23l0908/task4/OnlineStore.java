package ru.mirea.practice.s23l0908.task4;

import java.util.Scanner;

public abstract class OnlineStore {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] products = new String[]{"Телефон", "Ноутбук", "Наушники"};
            double[] prices = new double[]{300.0, 1000.0, 50.0};

            final double usdToRub = 100.0;
            final double usdToEur = 0.85;
            final double usdToGbp = 0.75;

            System.out.println("Добро пожаловать в интернет-магазин!");
            System.out.println("Выберите товар:");

            int productChoice;
            for (productChoice = 0; productChoice < products.length; ++productChoice) {
                System.out.println(productChoice + 1 + ". " + products[productChoice] + " - $" + prices[productChoice]);
            }

            System.out.print("Введите номер товара: ");
            productChoice = scanner.nextInt() - 1;
            if (productChoice >= 0 && productChoice < products.length) {
                double priceInUsd = prices[productChoice];
                System.out.println("Вы выбрали: " + products[productChoice] + " за $" + priceInUsd);
                System.out.println("Выберите валюту для оплаты:");
                System.out.println("1. Доллары США (USD)");
                System.out.println("2. Рубли (RUB)");
                System.out.println("3. Евро (EUR)");
                System.out.println("4. Фунты стерлингов (GBP)");
                System.out.print("Введите номер валюты: ");
                int currencyChoice = scanner.nextInt();
                double finalPrice = 0.0;
                String currency = "";

                switch (currencyChoice) {
                    case 1:
                        finalPrice = priceInUsd;
                        currency = "USD";
                        break;
                    case 2:
                        finalPrice = priceInUsd * usdToRub;
                        currency = "RUB";
                        break;
                    case 3:
                        finalPrice = priceInUsd * usdToEur;
                        currency = "EUR";
                        break;
                    case 4:
                        finalPrice = priceInUsd * usdToGbp;
                        currency = "GBP";
                        break;
                    default:
                        System.out.println("Неверный выбор валюты.");
                        return;
                }

                System.out.printf("Итоговая стоимость товара: %.2f %s\n", finalPrice, currency);
            } else {
                System.out.println("Неверный выбор товара.");
            }
        }
    }
}
