package ru.mirea.practice.s23L0908.pw4.task1;

public abstract class TestYear {
    public static void main(String[] args) {
        Year a = Year.SUMMER;
        System.out.println(a);
        System.out.println();

        a.loveSeasons();
        System.out.println();


        Year b = Year.WINTER;
        System.out.println(b.getDestriction());
        System.out.println(a.getDestriction());
        System.out.println();

        for (Year c: Year.values()) {
            System.out.println("This season is " + c + ". Average temperature is " + c.getF());
        }

    }
}
