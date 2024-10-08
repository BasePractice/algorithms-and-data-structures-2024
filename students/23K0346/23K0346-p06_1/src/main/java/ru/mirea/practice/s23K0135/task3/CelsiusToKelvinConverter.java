package ru.mirea.practice.s23K0135.task3;

public class CelsiusToKelvinConverter implements Convertable {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
