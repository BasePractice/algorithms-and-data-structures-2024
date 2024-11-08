package ru.mirea.practice.s0000001.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Adresesses a = new Adresesses("France, Paris, New Paris, Wislow,  5, 1, 40");
        Adres q = new Adres("France; Paris. New Paris, Wislow,  5. 4, 20");
        System.out.println(a);
        System.out.println(q);
    }
}
