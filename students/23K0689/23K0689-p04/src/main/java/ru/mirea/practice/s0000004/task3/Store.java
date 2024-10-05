package ru.mirea.practice.s0000004.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
    private List<Product> products;
    private Cart cart;

    public Store() {
        this.products = new ArrayList<>();
        this.cart = new Cart();
        populateProducts();
    }

    public void populateProducts() {
        products.add(new Product("Смартфон", 50000, Catalogs.ELECTRONICS));
        products.add(new Product("Ноутбук", 70000, Catalogs.ELECTRONICS));
        products.add(new Product("Футболка", 1500, Catalogs.CLOTHING));
        products.add(new Product("Джинсы", 3000, Catalogs.CLOTHING));
        products.add(new Product("Хлеб", 50, Catalogs.GROCERIES));
        products.add(new Product("Молоко", 80, Catalogs.GROCERIES));
    }

    public void displayProducts(Catalogs catalog) {
        System.out.println("Товары в категории " + catalog.getCatalogName() + ":");
        for (Product product : products) {
            if (product.getCatalog() == catalog) {
                System.out.println(product);
            }
        }
    }

    public Product selectProduct(int index) {
        return products.get(index - 1);
    }

    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            User user = User.authenticate(scanner);

            while (true) {
                System.out.println("\nДобро пожаловать, " + user.getLogin() + "!");

                Catalogs.displayCatalogs();

                System.out.println("\nВыберите каталог (введите номер):");
                int catalogChoice = scanner.nextInt();

                Catalogs selectedCatalog = Catalogs.values()[catalogChoice - 1];
                displayProducts(selectedCatalog);

                System.out.println("\nВыберите товар для добавления в корзину (введите номер):");
                int productChoice = scanner.nextInt();

                Product selectedProduct = selectProduct(productChoice);
                cart.addProduct(selectedProduct);

                System.out.println("\nЖелаете продолжить покупки? (да/нет)");
                String continueShopping = scanner.next();
                if (!"да".equalsIgnoreCase(continueShopping)) {
                    break; // Выход из цикла, если пользователь не хочет продолжать покупки
                }
            }

            cart.displayCart();

            System.out.println("\nХотите оформить покупку? (да/нет)");
            String checkoutChoice = scanner.next();
            if ("да".equalsIgnoreCase(checkoutChoice)) {
                cart.checkout();
            } else {
                System.out.println("Спасибо за посещение!");
            }
        } catch (Exception e) {
            // Обработка исключений
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Store store = new Store();
        store.run();
    }
}