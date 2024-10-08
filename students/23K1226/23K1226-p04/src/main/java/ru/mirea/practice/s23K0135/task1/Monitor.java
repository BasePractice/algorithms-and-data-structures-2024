package ru.mirea.practice.s23K0135.task1;

class Monitor {
    private String brand;
    private int size;

    public Monitor(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    @Override
    public String toString() {
        return brand + " (" + size + " дюймов)";
    }
}
