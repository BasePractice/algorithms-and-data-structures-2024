package ru.mirea.practice.s0000001.n56;

import java.util.Scanner;

public final class Main11 {

    private Main11() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите температуру в градусах Цельсия: ");
            double celsius = scanner.nextDouble();

            Convertable kelvinConverter = new CelsKelv();
            Convertable fahrenheitConverter = new CelsFar();

            System.out.println("Температура в Кельвинах: " + kelvinConverter.convert(celsius));
            System.out.println("Температура в Фаренгейтах: " + fahrenheitConverter.convert(celsius));
        } finally {
            scanner.close();
        }
    }
}