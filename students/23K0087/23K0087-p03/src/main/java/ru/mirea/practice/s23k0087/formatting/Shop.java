package ru.mirea.practice.s23k0087.formatting;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Shop {
    private final Map<String, Double> products;

    public Shop() {
        products = new HashMap<>();
        initializeProducts();
    }

    private void initializeProducts() {
        products.put("Book", 500.0);
        products.put("Pen", 50.0);
        products.put("Copybook", 100.0);
        products.put("Porsche Cayman", 5000000.0);
    }

    public void startShopping(Scanner sc) {
        
        System.out.println("Available products:");
        for (String product : products.keySet()) {
            System.out.println(product + " - " + products.get(product) + " RUB");
        }

        System.out.print("Choose a product: ");
        String selectedProduct = sc.nextLine();

        if (!products.containsKey(selectedProduct)) {
            System.out.println("Product not found");
            return;
        }

        System.out.print("Choose a currency to pay with (RUB/USD/CNY): ");
        String selectedCurrency = sc.nextLine().toUpperCase(new Locale("en", "EN"));
        double priceInRub = products.get(selectedProduct);

        switch (selectedCurrency) {
            case "RUB":
                System.out.printf("The price of %s: %.2f%s", selectedProduct, priceInRub, selectedCurrency);
                break;
            case "USD":
                System.out.printf(
                        "The price of %s: %.2f%s or %.2f%s",
                        selectedProduct,
                        Converter.convertRubToUsd(priceInRub),
                        selectedCurrency,
                        priceInRub,
                        "RUB");
                break;
            case "CNY":
                System.out.printf(
                        "The price of %s: %.2f%s or %.2f%s",
                        selectedProduct,
                        Converter.convertRubToCny(priceInRub),
                        selectedCurrency,
                        priceInRub,
                        "RUB");
                break;
            default:
                System.out.println("Invalid currency");
                break;
        }
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        try (Scanner sc = new Scanner(System.in)) {
            shop.startShopping(sc);
        } catch (RuntimeException e) {
            throw e;
        }
    }
}
