package ru.mirea.practice.s23k0089.task1;

public abstract class Main {
    public static void main(String[] args) {
        Seasons season = Seasons.SUMMER;
        System.out.printf("%s, начинается 1 июня и длится до 31 августа, самый солнечный квартал в году\n", season);

        for (Seasons s : Seasons.values()) {
            System.out.printf("%s, %s\n", s, s.getDescription());
        }
    }
}