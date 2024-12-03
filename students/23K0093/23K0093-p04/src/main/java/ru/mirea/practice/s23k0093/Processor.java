package ru.mirea.practice.s23k0093;

class Processor {
    private String model;
    private int cores;
    private double frequency; // ГГц

    public Processor(String model, int cores, double frequency) {
        this.model = model;
        this.cores = cores;
        this.frequency = frequency;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Процессор: " + model + ", Ядер: " + cores + ", Частота: " + frequency + " ГГц";
    }
}