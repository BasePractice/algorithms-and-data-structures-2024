package ru.mirea.practice.s23k0375.task11a;

public class KelvCon implements Convertable {
    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}
