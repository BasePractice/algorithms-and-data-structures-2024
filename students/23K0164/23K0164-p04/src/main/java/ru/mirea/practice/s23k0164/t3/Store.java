package ru.mirea.practice.s23k0164.t3;

import java.util.Scanner;

public class Store {
    private Cart cart;
    private ProductServer productServer;
    private Scanner scanner;

    public Store() {
        productServer = new ProductServer();
        cart = new Cart();
        scanner = new Scanner(System.in);
    }

    public void displayProducts() {
        System.out.println("Доступные товары:");
        productServer.allProduct();
    }

    public void displayCatalogs() {
        productServer.allCatalog();
    }

    public void addProductToCart(int productIndex) {
        Product product = productServer.getProduct(productIndex);
        if (product != null) {
            cart.addProduct(product);
        } else {
            System.out.println("Некорректный индекс товара.");
        }
    }

    public void authenticateUser() {
        UserService userService = new UserService();
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        if (userService.authenticate(login, password)) {
            System.out.println("Аутентификация успешна! Добро пожаловать, " + login + "!");
        } else {
            System.out.println("Неверный логин или пароль.");
        }
    }

    public void checkout() {
        double total = cart.getTotalPrice();
        if (total > 0) {
            System.out.println("Итого: " + total + " руб.");
            System.out.println("Спасибо за покупку!");
            cart.clearCart();
        } else {
            System.out.println("Корзина пуста. Добавьте товары для покупки.");
        }
    }

    public void startShopping() {
        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Аутентификация");
            System.out.println("2. Показать все товары");
            System.out.println("3. Показать товары по каталогу");
            System.out.println("4. Добавить товар в корзину");
            System.out.println("5. Показать корзину");
            System.out.println("6. Оформить заказ");
            System.out.println("0. Выход");

            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    authenticateUser();
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    displayCatalogs();
                    System.out.print("Введите название категории: ");
                    String catalog = scanner.nextLine();
                    productServer.catalogChoise(catalog);
                    break;
                case 4:
                    System.out.print("Введите номер товара для добавления в корзину: ");
                    int productIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Clear the buffer
                    addProductToCart(productIndex);
                    break;
                case 5:
                    cart.displayCart();
                    break;
                case 6:
                    checkout();
                    break;
                case 0:
                    System.out.println("Выход из магазина.");
                    return;
                default:
                    System.out.println("Некорректный ввод. Попробуйте снова.");
                    break;
            }
        }
    }

    private int getUserChoice() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите корректный номер действия.");
            }
        }
    }
}

