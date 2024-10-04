package ru.mirea.practice.s23k0143;

class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваю мужчину в футболку цвета: " + getColor() + ", размер: " + getSize().getDescription() + ", цена: " + getPrice());
    }

    public void dressWomen() {
        System.out.println("Одеваю женщину в футболку цвета: " + getColor() + ", размер: " + getSize().getDescription() + ", цена: " + getPrice());
    }
}



