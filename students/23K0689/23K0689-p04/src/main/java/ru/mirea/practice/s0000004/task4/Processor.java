package ru.mirea.practice.s0000004.task4;

public class Processor {
    private String model;
    private double frequency;  // Частота процессора в ГГц
    private int cores;         // Количество ядер

    public Processor(String model, double frequency, int cores) {
        this.model = model;
        this.frequency = frequency;
        this.cores = cores;
    }

    public String getModel() {
        return model;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getCores() {
        return cores;
    }

    @Override
    public String toString() {
        return "Процессор: " + model + ", Частота: " + frequency + " ГГц, Ядер: " + cores;
    }
}