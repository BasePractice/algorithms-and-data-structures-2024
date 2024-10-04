package ru.mirea.practice.s0000001.task9.task11;

import java.util.Scanner;

public abstract class TemperatureConverter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите температуру в градусах Цельсия: ");
            double celsius = scanner.nextDouble();

            Convertable toKelvin = new CelsiusToKelvin();
            Convertable toFahrenheit = new CelsiusToFahrenheit();

            System.out.println("Температура в Кельвинах: " + toKelvin.convert(celsius));
            System.out.println("Температура в Фаренгейтах: " + toFahrenheit.convert(celsius));
        }
    }
}