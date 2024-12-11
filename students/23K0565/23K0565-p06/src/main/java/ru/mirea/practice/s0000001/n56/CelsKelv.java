package ru.mirea.practice.s0000001.n56;

public class CelsKelv implements Convertable {

    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }

    @Override
    public String toString() {
        return "Celsius to Kelvin Converter";
    }
}