package ru.mirea.practice.s23L0908.task1;

class Memory {
    private String brand;
    private int size;

    public Memory(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    @Override
    public String toString() {
        return brand + " (" + size + " ГБ)";
    }
}