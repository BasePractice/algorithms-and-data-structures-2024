package ru.mirea.practice.s23k0823.internetshop;

public abstract class Main {
    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();

        System.out.print("Enter login: ");
        String login = System.console().readLine();
        System.out.print("Enter password: ");
        String password = System.console().readLine();

        if (store.authenticateUser(login, password)) {
            System.out.println("Authentication successful!");

            store.viewCatalogs();

            Catalog clothingCatalog = store.catalogs.get(0);
            store.viewProducts(clothingCatalog);

            ShoppingCart cart = new ShoppingCart();

            Product tShirt = store.products.get(0);
            store.addToCart(tShirt, cart);

            Product phone = store.products.get(1);
            store.addToCart(phone, cart);

            store.purchase(cart);
        } else {
            System.out.println("Authentication failed! Access denied.");
        }
    }
}
