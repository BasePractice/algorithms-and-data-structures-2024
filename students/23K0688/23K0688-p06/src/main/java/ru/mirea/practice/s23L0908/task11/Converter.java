package ru.mirea.practice.s23L0908.task11;

public class Converter implements Convertable {
    public double kelvin(double celsius) {
        return celsius + 273;
    }

    public double farenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
}
