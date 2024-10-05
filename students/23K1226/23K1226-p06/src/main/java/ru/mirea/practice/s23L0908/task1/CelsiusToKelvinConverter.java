package ru.mirea.practice.s23L0908.task1;

class CelsiusToKelvinConverter implements Convertable {
    public double convert(double value) {
        return value + 273.15;
    }
}
