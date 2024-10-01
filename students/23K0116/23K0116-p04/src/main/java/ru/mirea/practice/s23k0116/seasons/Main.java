package ru.mirea.practice.s23k0116.seasons;

import static ru.mirea.practice.s23k0116.seasons.Seasons.printfavoriteSeason;

public abstract class Main {
    public static void main(String[] args) {
        Seasons bestseason = Seasons.WINTER;
        System.out.println("Моё любимое время года: " + bestseason);
        System.out.println("Средняя температура составляет: " + bestseason.getAvarageTemp() + "°C");
        System.out.println("Характеристика: " + bestseason.getDescription());

        printfavoriteSeason(bestseason);

        for (Seasons season : Seasons.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура составляет: " + season.getAvarageTemp() + "°C");
            System.out.println("Характеристика: " + season.getDescription());
        }
    }
}

