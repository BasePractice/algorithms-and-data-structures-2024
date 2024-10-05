package ru.mirea.practice.s23L0908.prog6;


public abstract class Main {
    public static void main(String[] args) {
        Cars car = new Cars("VAG", "Black", 1000.0);
        System.out.println(car);

        System.out.println(car.getPrice());

        car.print();
    }
}
