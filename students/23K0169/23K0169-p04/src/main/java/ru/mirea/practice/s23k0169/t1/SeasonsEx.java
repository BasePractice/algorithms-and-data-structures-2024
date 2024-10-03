package ru.mirea.practice.s23k0169.t1;

public abstract class SeasonsEx {
    public static void main(String[] args) {
        Season myFavoriteSeason = Season.SUMMER;

        System.out.println("Мое любимое время года: " + myFavoriteSeason);
        System.out.println("Средняя температура: " + myFavoriteSeason.getAverageTemperature());
        System.out.println("Описание: " + myFavoriteSeason.getDescription());

        printSeasonInfo(myFavoriteSeason);

        for (Season season : Season.values()) {
            System.out.println(season + ": " + season.getDescription() + " (средняя температура " + season.getAverageTemperature() + "°C)");
        }
    }

    public static void printSeasonInfo(Season season) {
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
                break;
        }
    }
}
