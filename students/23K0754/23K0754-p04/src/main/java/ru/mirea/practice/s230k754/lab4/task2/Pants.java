package ru.mirea.practice.s230k754.lab4.task2;

public class Pants extends Clothes implements MenClothing,WomenClothing  {
    public Pants(double price, int size, String color) {
        super(price, size, color);

    }

    public void dressMan() {
        System.out.printf("Мужские штаны: цена: %f,цвет: %s,размер: %d\n", this.getPrice(), this.getColor(), this.getSize());
    }


    public void dressWomen() {
        System.out.printf("Женские штаны: цена: %f,цвет: %s,размер: %d\n", this.getPrice(), this.getColor(), this.getSize());
    }
}
