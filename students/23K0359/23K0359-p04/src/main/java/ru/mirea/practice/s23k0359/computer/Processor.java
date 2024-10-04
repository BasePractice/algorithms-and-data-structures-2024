package ru.mirea.practice.s23k0359.computer;

public class Processor {
    private String brand;
    private String generation;
    private int frequency;


    public Processor(String brand, int frequency, String generation) {
        this.brand = brand;
        this.frequency = frequency;
        this.generation = generation;
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

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }
}
