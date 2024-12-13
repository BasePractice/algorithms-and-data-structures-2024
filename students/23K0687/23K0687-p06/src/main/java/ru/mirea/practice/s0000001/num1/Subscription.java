package ru.mirea.practice.s0000001.num1;

public class Subscription implements Priceable {
    private String plan;
    private double price;

    public Subscription(String plan, double price) {
        this.plan = plan;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getPlan() {
        return plan;
    }
}
