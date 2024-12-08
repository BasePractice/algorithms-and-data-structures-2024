package ru.mirea.practice.s23k0120.task2;

public class DataFreq<E> implements Comparable<E> {
    private final E data;
    private final double frequency;

    public DataFreq(E data, double frequency) {
        this.data = data;
        this.frequency = frequency;
    }

    public E getData() {
        return data;
    }

    public double getFrequency() {
        return frequency;
    }

    @Override
    public int compareTo(Object o) {
        return Double.compare(frequency, ((DataFreq<?>) o).getFrequency());
    }

    @Override
    public String toString() {
        return "Data:{" + data + "; Frequency: " + frequency + "}";
    }
}
