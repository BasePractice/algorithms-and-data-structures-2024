package ru.mirea.practice.s0000001;

import java.util.Date;
import java.util.Scanner;

public abstract class Taskn2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            final Date dt = new Date();
            Date sysd = new Date();
            sysd.setTime(System.currentTimeMillis());
            final Date inp = new Date();
            System.out.println("input seconds:");
            long sec = sc.nextLong() * 1000;
            System.out.println("input minutes:");
            long min = sc.nextLong() * 1000 * 60;
            System.out.println("input hours:");
            long hrs = sc.nextLong() * 1000 * 60 * 60 - 3000 * 60 * 60;
            System.out.println("input days:");
            long days = sc.nextLong() * 1000 * 60 * 60 * 24;
            System.out.println("input years:");
            long years = sc.nextLong() * 1000 * 60 * 60 * 24 * 365;
            long time = sec + min + hrs + days + years;
            System.out.println("current date:" + dt);
            System.out.println("system date:" + sysd);
            inp.setTime(time);
            System.out.println("inputted date:" + inp);
            if (dt.compareTo(sysd) > 0) {
                System.out.println("current date is more advanced than system date");
            } else if (dt.compareTo(sysd) == 0) {
                System.out.println("current and system dates are equal");
            } else {
                System.out.println("current date is less advanced than system date");
            }
            if (inp.compareTo(sysd) > 0) {
                System.out.println("inputted date is more advanced than system date");
            } else if (inp.compareTo(sysd) == 0) {
                System.out.println("input and system dates are equal");
            } else {
                System.out.println("inputted date is less advanced than system date");
            }
        }
    }
}
