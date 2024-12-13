package ru.mirea.practice.s23k0145.lab2;

public class Customer {
    private Furniture furniture;

    public void relax() {
        System.out.printf("Клиент использует %s\n", furniture.getClass().getSimpleName());
    }

    public void setFurniture(Furniture furniture) {
        this.furniture = furniture;
    }
}
