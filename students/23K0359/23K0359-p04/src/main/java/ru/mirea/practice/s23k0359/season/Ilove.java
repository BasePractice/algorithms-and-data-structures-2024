package ru.mirea.practice.s23k0359.season;

public abstract class Ilove {
    public static void main(String[] args) {
        Seasons summer = Seasons.SUMMER;
        Seasons winter = Seasons.WINTER;
        summer.loveSeasons();
        System.out.println(summer.getDescription());
        System.out.println(winter.getDescription());
        for (Seasons i: Seasons.values()) {
            System.out.println(i);
        }
    }
}
