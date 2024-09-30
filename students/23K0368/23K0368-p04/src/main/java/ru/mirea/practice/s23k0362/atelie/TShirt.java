package ru.mirea.practice.s23k0362.atelie;

class TShirt extends Clothes {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    public void dressMan() {
        System.out.println("Мужчина одет в футболку: размер " + size.getDescription() + ", цена " + price + ", цвет " + color);
    }

    public void dressWomen() {
        System.out.println("Женщина одета в футболку: размер " + size.getDescription() + ", цена " + price + ", цвет " + color);
    }
}
