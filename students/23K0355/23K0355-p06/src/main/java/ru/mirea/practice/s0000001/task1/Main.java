package ru.mirea.practice.s0000001.task1;

public final class Main {

    private Main() {}

    public static void main(String[] args) {
        Nameable p = new Planet("Earth");
        Nameable c = new Car("Tesla");
        Nameable a = new Animal("Lion");

        System.out.println("Название планеты: " + p.getN());
        System.out.println("Название машины: " + c.getN());
        System.out.println("Имя животного: " + a.getN());
    }
}