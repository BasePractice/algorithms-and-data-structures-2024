package ru.mirea.practice.s230k754.lab4.task2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(double price, int size, String color) {
        super(price, size, color);
    }


    public void dressWomen() {
        System.out.printf("Женская юбка: цена: %f,цвет: %s,размер: %d\n", this.getPrice(), this.getColor(), this.getSize());
    }
}
