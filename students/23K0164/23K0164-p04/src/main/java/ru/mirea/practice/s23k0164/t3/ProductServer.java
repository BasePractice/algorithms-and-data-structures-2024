package ru.mirea.practice.s23k0164.t3;

public class ProductServer {
    private Product[] productsArray;

    public ProductServer() {
        productsArray = new Product[12];
        productsArray[0] = new Product("Эко-сумка \"GreenBag\"", 2400, "Женщинам");
        productsArray[1] = new Product("Держатель для телефона в машину", 750, "Мужчинам");
        productsArray[2] = new Product("Ваза с котиками", 750, "Дом");
        productsArray[3] = new Product("Умные наушники \"SoundWave Pro\"", 7500, "Техника");
        productsArray[4] = new Product("Косметический набор \"GlowUp\"", 4600, "Женщинам");
        productsArray[5] = new Product("Игровая консоль \"GameSphere X\"", 45631, "Техника");
        productsArray[6] = new Product("Принтер", 15500, "Техника");
        productsArray[7] = new Product("Часы", 27500, "Мужчинам");
        productsArray[8] = new Product("Браслет \"Glow\"", 20000, "Женщинам");
        productsArray[9] = new Product("Станок для бритья", 2750, "Мужчинам");
        productsArray[10] = new Product("Электрокамин", 18800, "Дом");
        productsArray[11] = new Product("Часы настенные", 1250, "Дом");
    }

    public void allProduct() {
        for (Product product : productsArray) {
            System.out.println(product);
        }
    }

    public void allCatalog() {
        System.out.println("Техника \nМужчинам \nЖенщинам \nДом");
    }


    public void catalogChoise(String catalog) {
        for (Product product : productsArray) {
            if (product.getCatalog().equals(catalog)) {
                System.out.println(product);
            }
        }
    }

    public Product getProduct(int index) {
        if (index >= 0 && index < productsArray.length) {
            return productsArray[index];
        }
        return null;
    }
}

