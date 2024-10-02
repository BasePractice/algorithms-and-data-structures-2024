package ru.mirea.practice.s23k0823.internetshop;

public class Catalog {
    private CatalogType type;
    private String name;

    public Catalog(CatalogType type, String name) {
        this.type = type;
        this.name = name;
    }

    public CatalogType getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
