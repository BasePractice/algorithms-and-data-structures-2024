package ru.mirea.practice.s23k0362;

import java.util.Arrays;
import java.util.Scanner;

/*
Создать мини-Приложение интернет-магазин. В приложении
рассчитывается стоимость покупки товара, где пользователь может выбрать
валюту для оплаты товара
 */

public class FormatString2 {
    static Scanner sc = new Scanner(System.in);
    private static final String[] arrCur = {"USd", "RUB", "EUR", "CNY"};

    private FormatString2() {}

    private static  double enterPrice() {
        System.out.println("Please, enter the price in USd: ");
        double priceUSd;
        try {
            priceUSd = Double.parseDouble(sc.next());
        } catch (NumberFormatException ignore) {
            System.out.println("Invalid input");
            priceUSd = enterPrice();
        }
        return priceUSd;
    }

    private static void enterMoney(double priceUSd) {
        System.out.println("Please, enter the currency" + Arrays.toString(arrCur) + ": ");
        sc.nextLine();
        String currency = sc.nextLine().toUpperCase();
        if (Arrays.asList(arrCur).contains(currency) || currency.equals("USD")) {
            System.out.println("Price: " + convertCur(priceUSd, currency) + " " + currency);
        } else {
            System.out.println("Not such currency, try again");
            enterMoney(priceUSd);
        }
    }

    private static double convertCur(double priceUSd, String curr) {
        return switch (curr) {
            case "RUB" -> 91 * priceUSd;
            case "EUR" -> 0.9 * priceUSd;
            case "CNY" -> 7.08 * priceUSd;
            default -> priceUSd;
        };
    }

    public static void main(String[] args) {
        System.out.println("Hello!");
        double priceUSd = enterPrice();
        enterMoney(priceUSd);
    }
}
