package ru.mirea.practice.u23k1158.t11;

public abstract class Main {

    public static void main(String[] args) {
        double tmp = 26.85;

        Convertable toKelvin = new Kelvin();
        double kelvin = toKelvin.convert(tmp);
        System.out.println(tmp + " °C = " + kelvin + " K");

        Convertable toFahrenheit = new Fahrenheit();
        double fahrenheit = toFahrenheit.convert(tmp);
        System.out.println(tmp + " °C = " + fahrenheit + " °F");

    }
}
