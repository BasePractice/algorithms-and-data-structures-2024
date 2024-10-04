package ru.mirea.practice.s23f0011.task9;

class Sofa extends Furniture {
    private final int seats;

    public Sofa(String name, String material, double price, int seats) {
        super(name, material, price);
        this.seats = seats;
    }

    @Override
    public double calculatePrice() {
        return price + (seats * 20); // Дополнительная цена за каждое место
    }

    public int getSeats() {
        return seats;
    }
}
