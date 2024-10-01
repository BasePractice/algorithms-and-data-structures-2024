package ru.mirea.practice.s0000001;

public class Processor {
    private String model;
    private int cores;
    private double frequency;

    public Processor(String model, int cores, double frequency) {
        this.model = model;
        this.cores = cores;
        this.frequency = frequency;
    }

    public String getModel() {
        return model;
    }

    public int getCores() {
        return cores;
    }

    public double getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return String.format("Процессор: %s, Ядер: %d, Частота: %.2f ГГц", model, cores, frequency);
    }
}