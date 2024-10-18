package ru.mirea.practice.s23L0908.internetshop;

public enum ProductCategory {
    ELECTRONICS("Электроника"),
    CLOTHING("Одежда"),
    BOOKS("Книги"),
    HOME("Товары для дома"),
    OTHER("Прочее");

    private final String categoryName;

    ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}