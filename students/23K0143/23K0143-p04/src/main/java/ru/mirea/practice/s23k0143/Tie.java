package ru.mirea.practice.s23k0143;

class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваю мужчину в галстук цвета: " + getColor() + ", размер: " + getSize().getDescription() + ", цена: " + getPrice());
    }
}

