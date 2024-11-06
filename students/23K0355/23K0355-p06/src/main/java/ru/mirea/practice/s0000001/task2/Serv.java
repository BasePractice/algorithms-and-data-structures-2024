package ru.mirea.practice.s0000001.task2;

public class Serv implements Priceables {
    private String d;
    private double r;

    public Serv(String d, double r) {
        this.d = d;
        this.r = r;
    }

    @Override
    public double getP() {
        return r;
    }

    @Override
    public String toString() {
        return d + " цена " + r;
    }
}