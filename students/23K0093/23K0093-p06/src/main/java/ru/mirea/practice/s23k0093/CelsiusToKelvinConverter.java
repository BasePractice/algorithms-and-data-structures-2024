package ru.mirea.practice.s23k0093;

class CelsiusToKelvinConverter implements Convertable {
    @Override
    public double convert(double temperature) {
        return temperature + 273.15;
    }
}