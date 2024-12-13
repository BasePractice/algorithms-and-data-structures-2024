package ru.mirea.practice.s23k0120.task1;

public class Processor implements Comparable<Processor> {
    private final int key;
    private final String name;
    private final double tickFrequency;
    private final int cacheSize;
    private final double systemBusFrequency;
    private final int specInt;
    private final int specFp;

    public Processor(int key, String name, double tickFrequency, int cacheSize, double systemBusFrequency, int specInt, int specFp) {
        this.key = key;
        this.name = name;
        this.tickFrequency = tickFrequency;
        this.cacheSize = cacheSize;
        this.systemBusFrequency = systemBusFrequency;
        this.specInt = specInt;
        this.specFp = specFp;
    }

    public int getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public double getTickFrequency() {
        return tickFrequency;
    }

    public int getCacheSize() {
        return cacheSize;
    }

    public double getSystemBusFrequency() {
        return systemBusFrequency;
    }

    public int getSpecInt() {
        return specInt;
    }

    public int getSpecFp() {
        return specFp;
    }

    @Override
    public int compareTo(Processor o) {
        return Integer.compare(this.key, o.key);
    }

    @Override
    public String toString() {
        return String.valueOf(key);
    }
}
