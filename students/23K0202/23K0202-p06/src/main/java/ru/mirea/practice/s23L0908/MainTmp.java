package ru.mirea.practice.s23L0908;

public abstract class MainTmp {
    public static void main(String[] args) {
        double tmp = 15.0;

        Convertable toKelvin = new TmpKelvin();
        double kelvin = toKelvin.convert(tmp);
        System.out.println(tmp + " °C = " + kelvin + " K");

        Convertable toFahrenheit = new TmpFahrenheit();
        double fahrenheit = toFahrenheit.convert(tmp);
        System.out.println(tmp + " °C = " + fahrenheit + " °F");

    }
}
