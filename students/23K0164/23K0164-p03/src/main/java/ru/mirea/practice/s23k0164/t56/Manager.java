package ru.mirea.practice.s23k0164.t56;

import java.util.Scanner;
import java.util.Locale;

public final class Manager {

    private Manager() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String currency = "";

            boolean validInput = false;
            while (!validInput) {
                System.out.println("В какой валюте вы желаете совершить покупку? \nRUB \nUSD \nEUR \nGBP \nJPY "
                        + "\n(Пожалуйста, введите строку, содержащую три буквы выбранной вами валюты)");
                currency = scanner.nextLine().toUpperCase(Locale.ROOT);

                switch (currency) {
                    case "RUB":
                    case "USD":
                    case "EUR":
                    case "GBP":
                    case "JPY":
                        validInput = true;
                        System.out.println("Вы выбрали валюту: " + currency);
                        break;
                    default:
                        System.out.println("Ошибка: Вы ввели невозможную комбинацию. Выберите из перечня. Попробуйте снова.");
                        break;
                }
            }

            Product.ListProduct product1 = Product.ListProduct.Product1;
            Product.ListProduct product2 = Product.ListProduct.Product2;
            Product.ListProduct product3 = Product.ListProduct.Product3;
            Product.ListProduct product4 = Product.ListProduct.Product4;

            double rise1 = convertCost(product1.getCost(), currency);
            double rise2 = convertCost(product2.getCost(), currency);
            double rise3 = convertCost(product3.getCost(), currency);
            double rise4 = convertCost(product4.getCost(), currency);

            System.out.println("Какой товар вы бы хотели приобрести? (Выберите цифру от 1 до 4)");
            System.out.println(" 1." + product1.getName() + " - " + rise1 + " " + currency);
            System.out.println(" 2." + product2.getName() + " - " + rise2 + " " + currency);
            System.out.println(" 3." + product3.getName() + " - " + rise3 + " " + currency);
            System.out.println(" 4." + product4.getName() + " - " + rise4 + " " + currency);

            boolean validProductInput = false;
            int product = 0;

            while (!validProductInput) {
                System.out.print("Введите номер товара: ");
                if (scanner.hasNextInt()) {
                    product = scanner.nextInt();
                    if (product >= 1 && product <= 4) {
                        validProductInput = true;
                    } else {
                        System.out.println("Ошибка: Введите число от 1 до 4.");
                    }
                } else {
                    System.out.println("Ошибка: Ввод должен быть числом.");
                    scanner.next();
                }
            }

            int money = 0;
            switch (product) {
                case 1:
                    System.out.println("Вы выбрали товар 1." + product1.getName()
                            + " - Вам надо заплатить" + rise1 + " " + currency + "\nНапишите число сколько денег вы внесли:");
                    money = scanner.nextInt();
                    money(rise1, money);
                    break;
                case 2:
                    System.out.println("Вы выбрали товар 2." + product2.getName()
                            + " - Вам надо заплатить" + rise2 + " " + currency + "\nНапишите число сколько денег вы внесли:");
                    money = scanner.nextInt();
                    money(rise2, money);
                    break;
                case 3:
                    System.out.println("Вы выбрали товар 3." + product3.getName()
                            + " - Вам надо заплатить" + rise3 + " " + currency + "\nНапишите число сколько денег вы внесли:");
                    money = scanner.nextInt();
                    money(rise3, money);
                    break;
                case 4:
                    System.out.println("Вы выбрали товар 4." + product4.getName()
                            + " - Вам надо заплатить" + rise4 + " " + currency + "\nНапишите число сколько денег вы внесли:");
                    money = scanner.nextInt();
                    money(rise4, money);
                    break;
                default:
                    System.out.println("Ошибка: Неверный номер товара.");
                    break;
            }
        }
    }

    public static void money(double rise, int money) {
        try (Scanner scanner = new Scanner(System.in)) {
            int dif = 0;
            if (money < rise) {
                dif = (int) rise - money;
                System.out.print("У вас не хватает " + dif);
                int flag = 0;
                System.out.print("Внести ещё? (Ответ: Да - напишите 1, Нет - напишите 0): ");
                flag = scanner.nextInt();
                if (flag == 1) {
                    System.out.print("Внесите ещё: " + dif);
                    money = scanner.nextInt();
                    money(dif, money);
                } else {
                    System.out.print("Жаль, что не получилось приобрести, ждём вас в следующий раз.");
                }
            } else {
                if (money == rise) {
                    System.out.print("Спасибо за покупку, ждём вас снова!");
                } else {
                    dif = money - (int) rise;
                    System.out.print("Спасибо за покупку, ждём вас снова! Вот ваша сдача: " + dif);
                }
            }
        }
    }

    public static double convertCost(double rise, String currency) {
        CurrencyConverter converter = new CurrencyConverter();
        double convertedCost;
        switch (currency) {
            case "RUB":
                return rise;
            case "USD":
                convertedCost = converter.convert(rise, CurrencyConverter.Currency.USD);
                return convertedCost;
            case "EUR":
                convertedCost = converter.convert(rise, CurrencyConverter.Currency.EUR);
                return convertedCost;
            case "GBP":
                convertedCost = converter.convert(rise, CurrencyConverter.Currency.GBP);
                return convertedCost;
            case "JPY":
                convertedCost = converter.convert(rise, CurrencyConverter.Currency.JPY);
                return convertedCost;
            default:
                return rise;
        }
    }
}
