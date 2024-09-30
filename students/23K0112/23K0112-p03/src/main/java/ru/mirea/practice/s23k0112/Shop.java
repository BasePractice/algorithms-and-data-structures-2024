package ru.mirea.practice.s23k0112;

import java.util.Scanner;

public final class Shop {
    private Shop() {

    }

    public static void main(String[] args) {
        Product[] products = {new Product(1, "Computer", "USD", 1200), new Product(2, "Cap", "CNY", 700), new Product(3, "Gloves", "RUB", 2000)};

        System.out.println("Catalog");
        for (Product product : products) {
            System.out.println(product + "\n");
        }

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Choose your currency (RUB, USD, CNY, EUR):");
            String userCurrency = scanner.nextLine();
            System.out.println("Choose your product from the catalog:");
            Product chosenProduct = products[scanner.nextInt() - 1];
            String productCurrency = chosenProduct.getCurrency();
            double productPrice = chosenProduct.getPrice();
            Converter converter = new Converter(); // Fixed spelling of 'converter'

            if ("RUB".equals(userCurrency)) { // Use equals method for string comparison
                if ("USD".equals(productCurrency)) {
                    System.out.printf("Price in USD: %.2f\nPrice in RUB: %.2f%n", productPrice, converter.convertUsdToRub(productPrice));
                }
                if ("CNY".equals(productCurrency)) {
                    System.out.printf("Price in CNY: %.2f\nPrice in RUB: %.2f%n", productPrice, converter.convertCnyToRub(productPrice));
                }
                if ("RUB".equals(productCurrency)) {
                    System.out.printf("Price in RUB: %.2f%n", productPrice);
                }
            }

            if ("USD".equals(userCurrency)) {
                if ("USD".equals(productCurrency)) {
                    System.out.printf("Price in USD: %.2f%n", productPrice);
                }
                if ("CNY".equals(productCurrency)) {
                    System.out.printf("Price in CNY: %.2f\nPrice in USD: %.2f%n", productPrice, converter.convertCnyToUsd(productPrice));
                }
                if ("RUB".equals(productCurrency)) {
                    System.out.printf("Price in RUB: %.2f\nPrice in USD: %.2f%n", productPrice, converter.convertRubToUsd(productPrice));
                }
            }

            if ("CNY".equals(userCurrency)) {
                if ("USD".equals(productCurrency)) {
                    System.out.printf("Price in USD: %.2f\nPrice in CNY: %.2f%n", productPrice, converter.convertUsdToCny(productPrice));
                }
                if ("CNY".equals(productCurrency)) {
                    System.out.printf("Price in CNY: %.2f%n", productPrice);
                }
                if ("RUB".equals(productCurrency)) {
                    System.out.printf("Price in RUB: %.2f\nPrice in CNY: %.2f%n", productPrice, converter.convertRubToCny(productPrice));
                }
            }
        }
    }
}