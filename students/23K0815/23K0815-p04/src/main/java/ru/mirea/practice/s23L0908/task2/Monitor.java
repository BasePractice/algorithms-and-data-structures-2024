package ru.mirea.practice.s23L0908.task2;

public class Monitor {
    private double size; // В дюймах

    public Monitor(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Monitor{"
                +
                "size=" + size
                +
                " inches"
                +
                '}';
    }
}
