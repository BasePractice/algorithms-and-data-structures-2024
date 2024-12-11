package ru.mirea.practice.s0000004.task3;

public enum Catalogs {
    ELECTRONICS("Электроника"),
    CLOTHING("Одежда"),
    GROCERIES("Продукты");

    private final String catalogName;

    Catalogs(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public static void displayCatalogs() {
        System.out.println("Каталоги товаров:");
        for (Catalogs catalog : Catalogs.values()) {
            System.out.println(catalog.ordinal() + 1 + ". " + catalog.getCatalogName());
        }
    }
}
