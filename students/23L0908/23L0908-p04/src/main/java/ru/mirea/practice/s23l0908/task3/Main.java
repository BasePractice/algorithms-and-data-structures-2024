package ru.mirea.practice.s23l0908.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public final class Main {

    private Main() {

    }

    private static Map<String, List<Product>> catalogMap;
    private static Cart cart;

    public static void main(String[] args) {
        initializeCatalog();


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Online Store!");
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            User user = new User("admin", "password123");
            if (!user.authenticate(username, password)) {
                System.out.println("Invalid username or password.");
                return;
            }
        }
        System.out.println("Successfully authenticated!");

        cart = new Cart();
        boolean running = true;
        try (Scanner scanner = new Scanner(System.in)) {
            while (running) {
                showMenu();
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (Operation.values()[choice]) {
                    case VIEW_CATALOGS:
                        viewCatalogs();
                        break;
                    case VIEW_PRODUCTS:
                        viewProducts(scanner);
                        break;
                    case ADD_TO_CART:
                        addToCart(scanner);
                        break;
                    case VIEW_CART:
                        cart.showCart();
                        break;
                    case CHECKOUT:
                        cart.checkout();
                        break;
                    case EXIT:
                        running = false;
                        System.out.println("Thank you for visiting the Online Store. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nPlease choose an option:");
        System.out.println("0 - View Catalogs");
        System.out.println("1 - View Products");
        System.out.println("2 - Add to Cart");
        System.out.println("3 - View Cart");
        System.out.println("4 - Checkout");
        System.out.println("5 - Exit");
    }

    private static void initializeCatalog() {
        catalogMap = new HashMap<>();
        List<Product> electronics = new ArrayList<>();
        electronics.add(new Product("Smartphone", 699.99));
        electronics.add(new Product("Laptop", 1199.99));
        catalogMap.put("Electronics", electronics);

        List<Product> books = new ArrayList<>();
        books.add(new Product("Java Programming", 39.99));
        books.add(new Product("Design Patterns", 49.99));
        catalogMap.put("Books", books);
    }

    private static void viewCatalogs() {
        System.out.println("Available catalogs:");
        for (String catalog : catalogMap.keySet()) {
            System.out.println("- " + catalog);
        }
    }

    private static void viewProducts(Scanner scanner) {
        System.out.print("Enter catalog name: ");
        String catalogName = scanner.nextLine();
        List<Product> products = catalogMap.get(catalogName);

        if (products != null) {
            System.out.println("Products in " + catalogName + ":");
            for (int i = 0; i < products.size(); i++) {
                System.out.println(i + " - " + products.get(i));
            }
        } else {
            System.out.println("Catalog not found.");
        }
    }

    private static void addToCart(Scanner scanner) {
        System.out.print("Enter catalog name: ");
        String catalogName = scanner.nextLine();
        List<Product> products = catalogMap.get(catalogName);

        if (products != null) {
            System.out.print("Enter product index to add to cart: ");
            int index = scanner.nextInt();
            if (index >= 0 && index < products.size()) {
                cart.addProduct(products.get(index));
                System.out.println("Product added to cart.");
            } else {
                System.out.println("Invalid product index.");
            }
        } else {
            System.out.println("Catalog not found.");
        }
    }
}
