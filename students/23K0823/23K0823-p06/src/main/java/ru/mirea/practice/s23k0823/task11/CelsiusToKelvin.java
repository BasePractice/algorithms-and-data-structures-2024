package ru.mirea.practice.s23k0823.task11;

class CelsiusToKelvin implements Convertable {
    @Override
    public double convert(double value) {
        return value + 273.15;
    }
}