package ru.mirea.practice.s230k754.lab4.task2;

public class Tie extends Clothes implements MenClothing {
    public Tie(double price, int size, String color) {
        super(price, size, color);
    }

    public void dressMan() {
        System.out.printf("Мужской галстук: цена: %f,цвет: %s,размер: %d\n", this.getPrice(), this.getColor(), this.getSize());
    }
}
