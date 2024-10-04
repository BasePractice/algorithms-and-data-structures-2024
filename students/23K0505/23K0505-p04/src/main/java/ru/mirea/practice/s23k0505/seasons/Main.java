package ru.mirea.practice.s23k0505.seasons;

public abstract class Main {
    public static void main(String[] args) {
        Seasons season = Seasons.SPRING;
        System.out.printf("%s, Длится с 1 марта по 31 мая, Второе время года в году\n", season);

        for (Seasons s : Seasons.values()) {
            System.out.printf("%s, %s\n", s, s.getDescription());
        }
    }
}
