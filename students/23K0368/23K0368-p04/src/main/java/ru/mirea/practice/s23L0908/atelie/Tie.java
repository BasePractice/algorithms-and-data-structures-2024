package ru.mirea.practice.s23L0908.atelie;

class Tie extends Clothes {
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    public void dressMan() {
        System.out.println("Мужчина одет в галстук: размер " + size.getDescription() + ", цена " + price + ", цвет " + color);
    }
}
