package ru.mirea.practice.s23K0135.task1;

public abstract class Test {
    public static void main(String[] args) {
        TimeOfYear timw = TimeOfYear.WINTER;
        System.out.println(timw);
        timw.say(timw);
        timw.getDescription();
        TimeOfYear tims = TimeOfYear.SUMMER;
        tims.getDescription();
        for (TimeOfYear t : TimeOfYear.values()) {
            System.out.println(t);
            t.getDescription();
        }
    }
}
