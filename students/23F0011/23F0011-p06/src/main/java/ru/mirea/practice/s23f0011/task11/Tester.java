package ru.mirea.practice.s23f0011.task11;

public abstract class Tester {
    public static void main(String[] args) {
        double celcium = 20;
        CelsiusToFahrenheit fahrenheit = new CelsiusToFahrenheit(celcium);
        CelsiusToKelvin kelvin = new CelsiusToKelvin(celcium);
        System.out.println(fahrenheit.convert());
        System.out.println(kelvin.convert());
    }
}
