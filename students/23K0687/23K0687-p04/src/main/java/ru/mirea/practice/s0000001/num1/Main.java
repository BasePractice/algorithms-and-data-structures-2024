package ru.mirea.practice.s0000001.num1;

public class Main {
    public static void main(String[] args) {
        Main mainApp = new Main();
        mainApp.run();
    }

    public void run() {
        Season fav = Season.SUMMER;
        System.out.println("Любимое время года: " + fav + ", Средняя температура: " + fav.getAvgTemp() + "°C, Описание: " + fav.getDescription());

        SeasonUtil.describeSeason(fav);
        SeasonUtil.printAllSeasons();
    }
}
