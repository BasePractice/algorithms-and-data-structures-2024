package ru.mirea.practice.s23L0908.internetshop;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Arrays;
import java.util.Scanner;

public class OnlineShop {
    private final Map<String, User>  users = new HashMap<>();
    private final Map<ProductCategory, List<Product>> catalog = new HashMap<>();
    private final Cart cart = new Cart();

    public OnlineShop() {
        // Заполните каталог товарами (примеры)
        catalog.put(ProductCategory.ELECTRONICS,
                Arrays.asList(
                        new Product("Смартфон", ProductCategory.ELECTRONICS, 500.00),
                        new Product("Ноутбук", ProductCategory.ELECTRONICS, 1000.00),
                        new Product("Наушники", ProductCategory.ELECTRONICS, 150.00)
                )
        );
        catalog.put(ProductCategory.CLOTHING,
                Arrays.asList(
                        new Product("Футболка", ProductCategory.CLOTHING, 20.00),
                        new Product("Джинсы", ProductCategory.CLOTHING, 50.00),
                        new Product("Куртка", ProductCategory.CLOTHING, 100.00)
                )
        );
        catalog.put(ProductCategory.BOOKS,
                Arrays.asList(
                        new Product("Роман", ProductCategory.BOOKS, 30.00),
                        new Product("Учебник", ProductCategory.BOOKS, 50.00),
                        new Product("Детская книга", ProductCategory.BOOKS, 15.00)
                )
        );
        catalog.put(ProductCategory.HOME,
                Arrays.asList(
                        new Product("Подушка", ProductCategory.HOME, 10.00),
                        new Product("Постельное белье", ProductCategory.HOME, 30.00),
                        new Product("Коврик", ProductCategory.HOME, 20.00)
                )
        );
        catalog.put(ProductCategory.OTHER,
                Arrays.asList(
                        new Product("Игрушка", ProductCategory.OTHER, 10.00),
                        new Product("Набор инструментов", ProductCategory.OTHER, 50.00),
                        new Product("Часы", ProductCategory.OTHER, 80.00)
                )
        );
    }

    public void registerUser(String login, String password) {
        users.put(login, new User(login, password));
    }

    public boolean authenticateUser(String login, String password) {
        User user = users.get(login);
        return user != null && user.getPassword().equals(password);
    }

    public void showCategories() {
        for (ProductCategory category : catalog.keySet()) {
            System.out.println(category.getCategoryName());
        }
    }

    public void showProducts(ProductCategory category) {
        List<Product> products = catalog.get(category);
        if (products != null) {
            for (Product product : products) {
                System.out.println(product.getName() + " - " + product.getPrice() + " руб.");
            }
        } else {
            System.out.println("Товаров в этой категории нет.");
        }
    }

    public void addToCart(Product product) {
        cart.addItem(product);
        System.out.println("Товар добавлен в корзину.");
    }

    public void removeFromCart(Product product) {
        cart.removeItem(product);
        System.out.println("Товар удален из корзины.");
    }

    public void showCart() {
        List<Product> items = cart.getItems();
        if (items.isEmpty()) {
            System.out.println("Ваша корзина пуста.");
        } else {
            System.out.println("Товары в корзине:");
            for (Product item : items) {
                System.out.println(item.getName() + " - " + item.getPrice() + " руб.");
            }
        }
    }

    public void checkout() {
        List<Product> items = cart.getItems();
        if (items.isEmpty()) {
            System.out.println("Ваша корзина пуста.");
        } else {
            double totalPrice = 0;
            for (Product item : items) {
                totalPrice += item.getPrice();
            }
            System.out.println("Итоговая сумма: " + totalPrice + " руб.");
            System.out.println("Оплата успешно завершена!");
            // Здесь можно добавить логику оплаты
            cart.getItems().clear();
        }
    }

    public static void main(String[] args) {
        OnlineShop shop = new OnlineShop();
        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("\nВыберите действие:");
                System.out.println("1. Регистрация");
                System.out.println("2. Авторизация");
                System.out.println("3. Просмотр каталогов");
                System.out.println("4. Просмотр товаров");
                System.out.println("5. Добавить в корзину");
                System.out.println("6. Удалить из корзины");
                System.out.println("7. Просмотреть корзину");
                System.out.println("8. Оформить заказ");
                System.out.println("9. Выход");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.println("Введите логин:");
                        String login = scanner.nextLine();
                        System.out.println("Введите пароль:");
                        String password = scanner.nextLine();
                        shop.registerUser(login, password);
                        System.out.println("Регистрация завершена.");
                        break;
                    case 2:
                        System.out.println("Введите логин:");
                        login = scanner.nextLine();
                        System.out.println("Введите пароль:");
                        password = scanner.nextLine();
                        if (shop.authenticateUser(login, password)) {
                            System.out.println("Авторизация успешна.");
                        } else {
                            System.out.println("Неверный логин или пароль.");
                        }
                        break;
                    case 3:
                        shop.showCategories();
                        break;
                    case 4:
                        shop.showCategories();
                        System.out.println("Введите категорию:");
                        String categoryName = scanner.nextLine();
                        ProductCategory category = ProductCategory.valueOf(
                                categoryName.toUpperCase(Locale.getDefault())); // Приводим к верхнему регистру
                        shop.showProducts(category);
                        break;
                    case 5:
                        shop.showCategories();
                        System.out.println("Введите категорию товара:");
                        categoryName = scanner.nextLine();
                        category = ProductCategory.valueOf(categoryName.toUpperCase(Locale.getDefault()));
                        shop.showProducts(category);
                        System.out.println("Введите название товара:");
                        String productName = scanner.nextLine();
                        Product product = shop.findProductByName(productName, category);
                        if (product != null) {
                            shop.addToCart(product);
                        } else {
                            System.out.println("Товар не найден.");
                        }
                        break;
                    case 6:
                        shop.showCart();
                        System.out.println("Введите название товара для удаления:");
                        productName = scanner.nextLine();
                        product = shop.findProductByName(productName, null);
                        if (product != null) {
                            shop.removeFromCart(product);
                        } else {
                            System.out.println("Товар не найден в корзине.");
                        }
                        break;
                    case 7:
                        shop.showCart();
                        break;
                    case 8:
                        shop.checkout();
                        break;
                    case 9:
                        System.out.println("До свидания!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Неверный выбор.");
                        break;
                }
            }
        }
    }

    private Product findProductByName(String productName, ProductCategory category) {
        if (category != null) {
            List<Product> products = catalog.get(category);
            if (products != null) {
                return products.stream()
                        .filter(p -> p.getName().equalsIgnoreCase(productName))
                        .findFirst()
                        .orElse(null);
            }
        } else {
            return catalog.values().stream()
                    .flatMap(List::stream)
                    .filter(p -> p.getName().equalsIgnoreCase(productName))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }
}
