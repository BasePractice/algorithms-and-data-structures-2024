package ru.mirea.practice.lab4.season;

public abstract class SeasonsEnumTest {
    public static void main(String[] args) {
        Season.Seasons myFavoriteSeasons = Season.Seasons.WINTER;
        Season.Seasons.printFavoriteSeason(myFavoriteSeasons);

        for (Season.Seasons seasons : Season.Seasons.values()) {
            System.out.println(seasons + ": " + seasons.getAverageTemperature() + "°C, " + seasons.getDescription());
        }
    }
}

