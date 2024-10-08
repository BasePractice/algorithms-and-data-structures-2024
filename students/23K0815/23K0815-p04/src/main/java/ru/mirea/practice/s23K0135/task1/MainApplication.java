package ru.mirea.practice.s23K0135.task1;

public abstract class MainApplication {

    public static void main(String[] args) {
        SeasonEnum myFavoriteSeason = SeasonEnum.SUMMER;
        System.out.println("Любимое время года: " + myFavoriteSeason);
        System.out.println("Средняя температура: " + myFavoriteSeason.getAverageTemperature());
        System.out.println("Описание: " + myFavoriteSeason.getDescription());

        printSeasonDescription(myFavoriteSeason);

        for (SeasonEnum season : SeasonEnum.values()) {
            System.out.println(season + " имеет среднюю температуру " + season.getAverageTemperature()
                    + " градусов. " + season.getDescription());
        }
    }

    public static void printSeasonDescription(SeasonEnum season) {
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
