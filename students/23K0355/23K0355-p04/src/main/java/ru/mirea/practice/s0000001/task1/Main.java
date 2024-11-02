package ru.mirea.practice.s0000001.task1;

import java.util.Locale;
import java.util.Scanner;

public abstract class Main {
    public enum Season {
        WINTER(-5), SPRING(10), SUMMER(25) {
            @Override
            public String getDescription() {
                return "Теплое время года";
            }
        }, AUTUMN(15);

        private final double avgTemp;

        Season(double avgTemp) {
            this.avgTemp = avgTemp;
        }

        public double getAvgTemp() {
            return avgTemp;
        }

        public String getDescription() {
            return "Холодное время года";
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите ваше любимое время года (WINTER, SPRING, SUMMER, AUTUMN):");
            String input = sc.nextLine().toUpperCase(Locale.ROOT); // Указываем Locale
            Season favSeason = Season.valueOf(input);

            System.out.println("Ваше любимое время года: " + favSeason);
            System.out.println("Средняя температура: " + favSeason.getAvgTemp());
            System.out.println("Описание: " + favSeason.getDescription());

            printSeasonMessage(favSeason);

            for (Season s : Season.values()) {
                System.out.println(s + ": Средняя температура = " + s.getAvgTemp() + ", Описание = " + s.getDescription());
            }
        }
    }

    public static void printSeasonMessage(Season s) {
        switch (s) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            default:
                System.out.println("Неизвестное время года");
                break;
        }
    }
}