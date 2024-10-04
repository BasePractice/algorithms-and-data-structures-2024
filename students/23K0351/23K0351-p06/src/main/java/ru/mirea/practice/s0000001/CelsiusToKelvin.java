package ru.mirea.practice.s0000001;

public class CelsiusToKelvin implements Convertable {
    @Override
    public double convert(double temperature) {
        return temperature + 273.15;
    }
}