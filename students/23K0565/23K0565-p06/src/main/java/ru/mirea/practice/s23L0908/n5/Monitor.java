package ru.mirea.practice.s23L0908.n5;

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
