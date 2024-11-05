package ru.mirea.practice.pr4;

public abstract class Main {

    public static void main(String[] args) {
        Season myFavoriteSeason = Season.SUMMER;
        System.out.println("Мое любимое время года: " + myFavoriteSeason);
        System.out.println("Средняя температура: " + myFavoriteSeason.getAverageTemperature());
        System.out.println("Описание: " + myFavoriteSeason.getDescription());

        printSeasonDescription(myFavoriteSeason);

        for (Season season : Season.values()) {
            System.out.println(season + " имеет среднюю температуру " + season.getAverageTemperature()
                    + " градусов. " + season.getDescription());
        }
    }

    public static void printSeasonDescription(Season season) {
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
            case FALL:
                System.out.println("Я люблю осень");
                break;
            default:
                System.out.println("Неизвестное время года");
                break;
        }
    }
}
