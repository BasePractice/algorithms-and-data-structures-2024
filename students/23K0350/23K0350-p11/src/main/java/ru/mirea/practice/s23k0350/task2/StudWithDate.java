package ru.mirea.practice.s23k0350.task2;

import java.util.Scanner;
import java.util.GregorianCalendar;

abstract class StudWithDate {
    public static void main(String[] args) {
        Stud st1 = new Stud("Ekaterina","Romanova","Computer Engineering",'3',"KEBO-05-21", new GregorianCalendar(2000, 11,11));
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter date format (long, med, short): ");
            String df = sc.next();
            st1.enabler(df);
            System.out.println(st1.toString());
        }


    }
}
