package ru.mirea.practice.s23L0908.atelie;

class Pants extends Clothes {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    public void dressMan() {
        System.out.println("Мужчина одет в штаны: размер " + size.getDescription() + ", цена " + price + ", цвет " + color);
    }

    public void dressWomen() {
        System.out.println("Женщина одета в штаны: размер " + size.getDescription() + ", цена " + price + ", цвет " + color);
    }
}
