package ru.mirea.practice.s23k0145.lab4;

public abstract class Season {
    public static void main(String[] args) {
        Seasons myFavoriteSeason = Seasons.WINTER;
        System.out.println("Мое любимое время года - " + myFavoriteSeason + "\nСредняя температура: " + myFavoriteSeason.getAverageTemperature()
                + "\nХарактеристика: " + myFavoriteSeason.getDescription());

        myFavorite(myFavoriteSeason);
        System.out.println("\nВсе времена года: ");
        for (Seasons season : Seasons.values()) {
            System.out.println("\n" + season + ":\nСредняя температура: " + season.getAverageTemperature()
                    + "\nХарактеристика: " + season.getDescription());
        }

    }

    public static void myFavorite(Seasons season) {
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
