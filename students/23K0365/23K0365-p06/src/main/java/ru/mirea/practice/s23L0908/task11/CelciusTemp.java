package ru.mirea.practice.s23L0908.task11;

public class CelciusTemp implements Convertable {
    private int temp;

    public CelciusTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public double convert() {
        return temp * 1.8 + 32;
    }

    @Override
    public String toString() {
        return temp + "*";
    }
}