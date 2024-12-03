package ru.mirea.practice.s23k0164.t11;

public class CelsiusToFahrenheitConverter implements Convertable {

    @Override
    public double convert(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}
