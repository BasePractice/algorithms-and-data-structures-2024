package ru.mirea.practice.s23L0908.Task1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    enum Season {
        WINTER(-5) {
            @Override
            public String getDescription() {
                return "Холодное время года";
            }
        },
        SPRING(10) {
            @Override
            public String getDescription() {
                return "Холодное время года";
            }
        },
        SUMMER(25) {
            @Override
            public String getDescription() {
                return "Теплое время года";
            }
        },
        AUTUMN(10) {
            @Override
            public String getDescription() {
                return "Холодное время года";
            }
        };

        private final int averageTemperature;
        Season(int averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        public int getAverageTemperature() {
            return averageTemperature;
        }
        public String getDescription() {
            return "Холодное время года";
        }
    }
    public static void main(String[] args) {
        // 1) Create a variable containing your favorite season and print all information about it
        Season favoriteSeason = Season.SUMMER;
        System.out.println("Любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание: " + favoriteSeason.getDescription());
        printSeasonMessage(favoriteSeason);
        for (Season season : Season.values()) {
            System.out.println(season + " - Средняя температура: " + season.getAverageTemperature() + "°C - " + season.getDescription());
        }
    }
    public static void printSeasonMessage(Season season) {
        switch (season) {
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
        }
    }
}
