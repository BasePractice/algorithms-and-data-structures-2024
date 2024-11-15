package ru.mirea.practice.s0000001.task1;

public class ProcessorRecord {
    private int key;
    private String name;
    private double clockFrequency;
    private int cacheSize;
    private double busFrequency;
    private int specint;
    private int specfp;

    public ProcessorRecord(int key, String name, double clockFrequency, int cacheSize, double busFrequency, int specint, int specfp) {
        this.key = key;
        this.name = name;
        this.clockFrequency = clockFrequency;
        this.cacheSize = cacheSize;
        this.busFrequency = busFrequency;
        this.specint = specint;
        this.specfp = specfp;
    }

    public int getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public double getClockFrequency() {
        return clockFrequency;
    }

    public int getCacheSize() {
        return cacheSize;
    }

    public double getBusFrequency() {
        return busFrequency;
    }

    public int getSpecint() {
        return specint;
    }

    public int getSpecfp() {
        return specfp;
    }

    @Override
    public String toString() {
        return "ProcessorRecord{"
            + "key=" + key
            + ", name='" + name + '\''
            + ", clockFrequency=" + clockFrequency
            + ", cacheSize=" + cacheSize
            + ", busFrequency=" + busFrequency
            + ", specint=" + specint
            + ", specfp=" + specfp
            + '}';
    }
}
