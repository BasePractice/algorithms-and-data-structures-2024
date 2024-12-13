package ru.mirea.practice.s23l0908;

public class ProcessorRecord {
    private final int key;
    private final String name;
    private final double frequency;
    private final int cacheSize;
    private final double busFrequency;
    private final int specInt;
    private final int specFp;

    public ProcessorRecord(int key, String name, double frequency, int cacheSize, double busFrequency, int specInt, int specFp) {
        this.key = key;
        this.name = name;
        this.frequency = frequency;
        this.cacheSize = cacheSize;
        this.busFrequency = busFrequency;
        this.specInt = specInt;
        this.specFp = specFp;
    }

    public int getKey() {
        return key;
    }

    public static ProcessorRecord fromString(String line) {
        String[] parts = line.split(", ");
        int key = Integer.parseInt(parts[0]);
        String name = parts[1];
        double frequency = Double.parseDouble(parts[2]);
        int cacheSize = Integer.parseInt(parts[3]);
        double busFrequency = Double.parseDouble(parts[4]);
        int specInt = Integer.parseInt(parts[5]);
        int specFp = Integer.parseInt(parts[6]);
        return new ProcessorRecord(key, name, frequency, cacheSize, busFrequency, specInt, specFp);
    }

    @Override
    public String toString() {
        return key + ", " + name + ", " + frequency + ", " + cacheSize + ", " + busFrequency + ", " + specInt + ", " + specFp;
    }
}
