package ru.mirea.practice.s23k0359.computer;

public class Memory {
    private String brand;
    private int frequency;
    private int size;

    public Memory(String brand, int frequency, int size) {
        this.brand = brand;
        this.frequency = frequency;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}