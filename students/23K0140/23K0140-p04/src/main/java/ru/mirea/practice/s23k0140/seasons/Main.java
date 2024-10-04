package ru.mirea.practice.s23k0140.seasons;

import static ru.mirea.practice.s23k0140.seasons.Seasons.printSeasonMessage;

public abstract class Main {
    public static void main(String[] args) {
        Seasons favoriteSeason = Seasons.SUMMER;

        System.out.println("Мое любимое время года: " + favoriteSeason);

        printSeasonMessage(favoriteSeason);

        for (Seasons season : Seasons.values()) {
            System.out.println(season);
        }
    }
}