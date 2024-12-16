package ru.mirea.practice.s0000001;

class Processor {
    int key;
    String name;
    double clockSpeed;
    int cacheSize;
    double busFrequency;
    int specInt;
    int specFp;

    public Processor(int key, String name, double clockSpeed, int cacheSize, double busFrequency, int specInt, int specFp) {
        this.key = key;
        this.name = name;
        this.clockSpeed = clockSpeed;
        this.cacheSize = cacheSize;
        this.busFrequency = busFrequency;
        this.specInt = specInt;
        this.specFp = specFp;
    }

    @Override
    public String toString() {
        return key + ", " + name + ", " + clockSpeed + ", " + cacheSize + ", " + busFrequency + ", " + specInt + ", " + specFp;
    }
}
