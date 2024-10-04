package ru.mirea.practice.s23k0145.lab6;

public abstract class TemperatureConversionTest {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter(25.0); // Пример: 25°C
        converter.printConversions();
    }
}
