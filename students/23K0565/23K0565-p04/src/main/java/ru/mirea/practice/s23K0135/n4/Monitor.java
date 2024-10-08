package ru.mirea.practice.s23K0135.n4;

public class Monitor {
    private final double size;

    public Monitor(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return size + " дюймов";
    }
}
