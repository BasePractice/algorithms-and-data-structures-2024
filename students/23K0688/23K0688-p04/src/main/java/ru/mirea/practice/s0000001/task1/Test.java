package ru.mirea.practice.s0000001.task1;

public abstract class Test {
    public static void main(String[] args) {
        TimeOfYear timw = TimeOfYear.Winter;
        System.out.println(timw);
        timw.say(timw);
        timw.getDescription();
        TimeOfYear tims = TimeOfYear.Summer;
        tims.getDescription();
        for (TimeOfYear t : TimeOfYear.values()) {
            System.out.println(t);
            t.getDescription();
        }
    }
}
