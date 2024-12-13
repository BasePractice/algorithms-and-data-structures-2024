package ru.mirea.practice.s0000001.num1;

public final class SeasonUtil {
    private SeasonUtil() {}

    public static void describeSeason(Season s) {
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
            case FALL:
                System.out.println("Я люблю осень");
                break;
            default:
                System.out.println("Неизвестное время года");
                break;
        }
    }

    public static void printAllSeasons() {
        for (Season s : Season.values()) {
            System.out.println(s + " - Средняя температура: " + s.getAvgTemp() + "°C, Описание: " + s.getDescription());
        }
    }
}
