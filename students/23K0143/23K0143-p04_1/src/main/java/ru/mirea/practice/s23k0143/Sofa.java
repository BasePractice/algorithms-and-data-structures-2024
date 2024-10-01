package ru.mirea.practice.s23k0143;

public class Sofa extends Furniture {
    private int cntSeat;

    public Sofa(String name, double price, int cntSeat) {
        super(name, price);
        this.cntSeat = cntSeat;
    }

    @Override
    public void displayInfo() {
        System.out.println("Диван: " + name + ", Цена: " + price + ", Вместимость: " + cntSeat);
    }
}