package ru.mirea.practice.s0000001.task2;

public class Products implements Priceables {
    private String n;
    private double p;

    public Products(String n, double p) {
        this.n = n;
        this.p = p;
    }

    @Override
    public double getP() {
        return p;
    }

    @Override
    public String toString() {
        return n + " costs " + p;
    }
}