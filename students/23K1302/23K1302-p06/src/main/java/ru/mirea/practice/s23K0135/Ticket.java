package ru.mirea.practice.s23K0135;

public class Ticket implements Priceable {
    private String event;
    private double price;

    public Ticket(String event, double price) {
        this.event = event;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getEvent() {
        return event;
    }
}
