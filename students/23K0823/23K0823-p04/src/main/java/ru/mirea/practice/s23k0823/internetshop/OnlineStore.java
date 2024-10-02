package ru.mirea.practice.s23k0823.internetshop;

import java.util.ArrayList;
import java.util.List;


public class OnlineStore {
    List<Catalog> catalogs;
    List<Product> products;
    private List<User> users;

    public OnlineStore() {
        this.catalogs = new ArrayList<>();
        this.products = new ArrayList<>();
        this.users = new ArrayList<>();

        Catalog clothingCatalog = new Catalog(CatalogType.CLOTHING, "Одежда");
        Catalog electronicsCatalog = new Catalog(CatalogType.ELECTRONICS, "Электроника");
        Catalog homeGoodsCatalog = new Catalog(CatalogType.HOME_GOODS, "Товары для дома");

        catalogs.add(clothingCatalog);
        catalogs.add(electronicsCatalog);
        catalogs.add(homeGoodsCatalog);

        Product tShirt = new Product("Футболка", 20.0, clothingCatalog);
        Product phone = new Product("Смартфон", 500.0, electronicsCatalog);
        Product chair = new Product("Стул", 100.0, homeGoodsCatalog);

        products.add(tShirt);
        products.add(phone);
        products.add(chair);

        User admin = new User("admin", "password");
        User user = new User("user", "password");

        users.add(admin);
        users.add(user);
    }

    public boolean authenticateUser(String login, String password) {
        for (User user : users) {
            if (user.authenticate(login, password)) {
                return true;
            }
        }
        return false;
    }

    public void viewCatalogs() {
        System.out.println("Каталоги:");
        for (Catalog catalog : catalogs) {
            System.out.println(catalog.getName());
        }
    }

    public void viewProducts(Catalog catalog) {
        System.out.println("Продукт в каталоге " + catalog.getName() + ":");
        for (Product product : products) {
            if (product.getCatalog().equals(catalog)) {
                System.out.println(product.getName() + " - " + product.getPrice());
            }
        }
    }

    public void addToCart(Product product, ShoppingCart cart) {
        cart.addProduct(product);
        System.out.println("Продукт добавлен в корзину!");
    }

    public void purchase(ShoppingCart cart) {
        System.out.println("Покупка - успешна!");
        System.out.println("Итоговая цена: " + calculateTotalPrice(cart));
    }

    private double calculateTotalPrice(ShoppingCart cart) {
        double totalPrice = 0.0;
        for (Product product : cart.getProducts()) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}

