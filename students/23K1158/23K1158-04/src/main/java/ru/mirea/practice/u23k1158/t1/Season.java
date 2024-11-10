package ru.mirea.practice.u23k1158.t1;

public abstract class Season {
    public static void main(String[] args) {
        Seasons myFavoriteSeason = Seasons.WINTER;
        System.out.println("Мое любимое время года - " + myFavoriteSeason + "\nСр.температура: " + myFavoriteSeason.getAverageTemperature()
                + "\nХар-ка: " + myFavoriteSeason.getDescription());

        myFavorite(myFavoriteSeason);
        System.out.println("\nВсе времена года: ");
        for (Seasons season : Seasons.values()) {
            System.out.println("\n" + season + ":\nСр.температура: " + season.getAverageTemperature()
                    + "\nХар-ка: " + season.getDescription());
        }

    }

    public static void myFavorite(Seasons season) {
        switch (season) {
            case WINTER:
                System.out.println("Я выбираю зиму");
                break;
            case SPRING:
                System.out.println("Я выбираю весну");
                break;
            case SUMMER:
                System.out.println("Я выбираю лето");
                break;
            case AUTUMN:
                System.out.println("Я выбираю осень");
                break;
            default:
                break;
        }
    }
}

