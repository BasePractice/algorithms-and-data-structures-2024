package ru.mirea.practice.s23f0011.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Nameable brand = new Brand("Nike");
        Nameable computer = new Computer("Lenovo");
        Nameable clothes = new Clothes("shirt");

        System.out.println(brand.getName());
        System.out.println(computer.getName());
        System.out.println(clothes.getName());
    }
}