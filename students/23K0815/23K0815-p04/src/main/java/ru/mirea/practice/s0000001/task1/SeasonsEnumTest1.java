package ru.mirea.practice.s0000001.task1;

public abstract class SeasonsEnumTest1 {
    public static void main(String[] args) {
        Season.Seasons myFavoriteSeasons = Season.Seasons.SPRING;
        Season.Seasons.printFavoriteSeason(myFavoriteSeasons);

        for (Season.Seasons seasons : Season.Seasons.values()) {
            System.out.println(seasons + ": " + seasons.getAverageTemperature() + "°C, " + seasons.getDescription());
        }
    }
}

