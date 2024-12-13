package ru.mirea.practice.s23k0143;

public class ProcessorRecord {
    int key;
    String name;
    double clockSpeed;
    int cacheSize;
    double busSpeed;
    int specInt;
    int specFp;

    public ProcessorRecord(int key, String name, double clockSpeed, int cacheSize, double busSpeed, int specInt, int specFp) {
        this.key = key;
        this.name = name;
        this.clockSpeed = clockSpeed;
        this.cacheSize = cacheSize;
        this.busSpeed = busSpeed;
        this.specInt = specInt;
        this.specFp = specFp;
    }
}
