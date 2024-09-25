package ru.mirea.practice.s230k754.lab4.task2;

public class TShirt extends Clothes implements MenClothing,WomenClothing {
    public TShirt(double price, int size, String color){
        super(price, size, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Мужская футболка: цена: %f,цвет: %s,размер: %d\n", this.getPrice(), this.getColor(), this.getSize());
    }

    @Override
    public void dressWomen() {
        System.out.printf("Женская футболка: цена: %f,цвет: %s,размер: %d\n", this.getPrice(), this.getColor(), this.getSize());
    }
}
