package ru.mirea.practice.s0000004.task1;

final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        // 1. Создать переменную, содержащую ваше любимое время года
        SeasonsEnum favoriteSeason = SeasonsEnum.SUMMER;
        System.out.println("Мое любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature());
        System.out.println("Описание: " + favoriteSeason.getDescription());

        // 2. Метод, принимающий на вход переменную enum и использующий switch
        printFavoriteSeasonMessage(favoriteSeason);

        // 6. В цикле распечатать все времена года, среднюю температуру и описание
        for (SeasonsEnum season : SeasonsEnum.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getAverageTemperature());
            System.out.println("Описание: " + season.getDescription());
            System.out.println();
        }
    }

    public static void printFavoriteSeasonMessage(SeasonsEnum season) {
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
                // Этот блок можно удалить, если вы уверены, что все значения SeasonsEnum обработаны
                System.out.println("Неизвестное время года");
                break; // break здесь не обязателен, так как это последний блок
        }
    }
}