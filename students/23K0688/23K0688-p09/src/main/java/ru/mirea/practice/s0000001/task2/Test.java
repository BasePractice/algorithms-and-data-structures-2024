package ru.mirea.practice.s0000001.task2;

import java.util.Arrays;

public abstract class Test {
    public static void main(String[] args) {
        Studentgpa[] s = new Studentgpa[4];
        s[0] = new Studentgpa(0);
        s[1] = new Studentgpa(2);
        s[2] = new Studentgpa(1);
        s[3] = new Studentgpa(3);
        System.out.println(Arrays.toString(s));
        GpaSorter srt = new GpaSorter();
        srt.quick(s,0,s.length - 1);
        System.out.println(Arrays.toString(s));
    }
}
