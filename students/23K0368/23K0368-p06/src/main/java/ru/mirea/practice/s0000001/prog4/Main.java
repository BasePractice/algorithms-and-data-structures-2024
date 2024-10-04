package ru.mirea.practice.s0000001.prog4;


public abstract class Main {
    public static void main(String[] args) {
        Cars car = new Cars("VAG", "Black", 1000.0);
        System.out.println(car);

        System.out.println(car.getPrice());
    }
}
