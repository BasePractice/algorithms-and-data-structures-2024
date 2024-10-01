package ru.mirea.practice.s0000001.task1;

public abstract class SeasonsDemo {
    public static void main(String[] args) {
        Season favoriteSeason = Season.SUMMER;
        System.out.println("Мое любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание: " + favoriteSeason.getDescription());

        printFavoriteSeasonMessage(favoriteSeason);

        System.out.println("\nВсе времена года:");
        for (Season season : Season.values()) {
            System.out.println(season + ": Средняя температура = " + season.getAverageTemperature() + "°C, Описание = " + season.getDescription());
        }
    }

    public static void printFavoriteSeasonMessage(Season season) {
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
            default:
                System.out.println("Неизвестное время года");
                break;
        }
    }
}

