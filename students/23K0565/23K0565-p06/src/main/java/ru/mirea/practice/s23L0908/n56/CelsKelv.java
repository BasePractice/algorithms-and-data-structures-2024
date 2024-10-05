package ru.mirea.practice.s23L0908.n56;

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
