package ru.mirea.practice.s23k0143;

import java.util.Scanner;

public abstract class OnlineStore {
    private static final String[] currencies = {"USD", "EUR", "RUB"};
    private static final double[] rates = {1.0, 0.90, 92.80};

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Converter converter = new Converter(currencies, rates);

            System.out.print("Введите название товара: ");
            String productName = sc.nextLine();
            System.out.print("Введите стоимость товара в USD: ");
            double priceUSD = sc.nextDouble();

            System.out.print("Выберите валюту для оплаты (USD, EUR, RUB): ");
            sc.nextLine();
            String newCurrency = sc.nextLine();

            double convertedPrice = converter.convert(priceUSD, "USD", newCurrency);
            System.out.println("Стоимость товара «" + productName + "» в " + newCurrency + ": " + String.format("%.2f", convertedPrice));
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}