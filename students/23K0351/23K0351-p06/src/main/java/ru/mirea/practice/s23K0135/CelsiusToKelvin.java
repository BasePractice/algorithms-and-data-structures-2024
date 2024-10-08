package ru.mirea.practice.s23K0135;

public class CelsiusToKelvin implements Convertable {
    @Override
    public double convert(double temperature) {
        return temperature + 273.15;
    }
}
