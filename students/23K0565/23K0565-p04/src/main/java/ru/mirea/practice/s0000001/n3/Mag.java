package ru.mirea.practice.s0000001.n3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public abstract class Mag {
    private static final Map<String, String> users = new HashMap<>();
    private static final List<String> categories = Arrays.asList("Электроника", "Одежда", "Книги");
    private static final Map<String, List<String>> products = new HashMap<>();
    private static final List<String> cart = new ArrayList<>();

    static {
        users.put("user", "pass");
        products.put("Электроника", Arrays.asList("Телефон", "Ноутбук", "Телевизор"));
        products.put("Одежда", Arrays.asList("Футболка", "Штаны", "Куртка"));
        products.put("Книги", Arrays.asList("Роман", "Учебник", "Комикс"));
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (!authenticate(scanner)) {
                System.out.println("Неверный логин или пароль:'(");
                return;
            }

            while (true) {
                System.out.println("Каталоги товаров:");
                for (int i = 0; i < categories.size(); i++) {
                    System.out.println((i + 1) + ". " + categories.get(i));
                }
                System.out.println("Выберите номер каталога или введите 0 для выхода:");
                int choice = scanner.nextInt();
                scanner.nextLine();
                if (choice == 0) {
                    break;
                }

                if (choice > 0 && choice <= categories.size()) {
                    viewCategoryProducts(categories.get(choice - 1), scanner);
                } else {
                    System.out.println("Неверный выбор:(");
                }
            }

            if (!cart.isEmpty()) {
                purchaseItems();
            }

            System.out.println("Спасибо за покупки!)");
        }
    }

    private static boolean authenticate(Scanner scanner) {
        System.out.println("Введите логин:");
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        return users.containsKey(login) && users.get(login).equals(password);
    }

    private static void viewCategoryProducts(String category, Scanner scanner) {
        System.out.println("Товары в категории " + category + ":");
        List<String> categoryProducts = products.get(category);
        for (int i = 0; i < categoryProducts.size(); i++) {
            System.out.println((i + 1) + ". " + categoryProducts.get(i));
        }
        System.out.println("Выберите товар для добавления в корзину или введите 0 для возврата:");
        int productChoice = scanner.nextInt();
        scanner.nextLine();

        if (productChoice > 0 && productChoice <= categoryProducts.size()) {
            String selectedProduct = categoryProducts.get(productChoice - 1);
            cart.add(selectedProduct);
            System.out.println(selectedProduct + " добавлен в корзину!");
        } else if (productChoice != 0) {
            System.out.println("Неверный выбор:(");
        }
    }

    private static void purchaseItems() {
        System.out.println("Ваши покупки:");
        for (String item : cart) {
            System.out.println(item);
        }
        System.out.println("Покупка завершена (^-^)");
    }
}