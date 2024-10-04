package ru.mirea.practice.s0000001.n56;

public class CelsFar implements Convertable {

    @Override
    public double convert(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    @Override
    public String toString() {
        return "Celsius to Fahrenheit Converter";
    }
}
