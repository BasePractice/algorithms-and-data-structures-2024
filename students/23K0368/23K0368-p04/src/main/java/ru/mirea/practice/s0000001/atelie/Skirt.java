package ru.mirea.practice.s0000001.atelie;

class Skirt extends Clothes {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    public void dressWomen() {
        System.out.println("Женщина одета в юбку: размер " + size.getDescription() + ", цена " + price + ", цвет " + color);
    }
}
