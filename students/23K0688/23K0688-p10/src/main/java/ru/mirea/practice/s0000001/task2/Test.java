package ru.mirea.practice.s0000001.task2;

import java.util.Arrays;

public abstract class Test {
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student(2,2);
        s[1] = new Student(3,3);
        s[2] = new Student(7,5);
        s[3] = new Student(5,4);
        Sortingstudentsbygpa srt = new Sortingstudentsbygpa();
        s = srt.setArray(s);
        srt.outArray(s);
        System.out.println("Start Array:" + Arrays.toString(s));
        srt.quickgpa(s,0,s.length - 1);
        System.out.println("Gpa quicksort:" + Arrays.toString(s));
        srt.merg(s,0,s.length - 1);
        System.out.println("ID mergesort:" + Arrays.toString(s));
    }
}
