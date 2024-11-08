package ru.mirea.practice.s23k0375.task11;

public class FahrCon implements Convertable {
    @Override
    public double convert(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}
