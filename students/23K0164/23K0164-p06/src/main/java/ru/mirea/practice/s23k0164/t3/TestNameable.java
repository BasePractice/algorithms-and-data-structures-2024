package ru.mirea.practice.s23k0164.t3;

public final class TestNameable {

    private TestNameable() {

    }

    public static void main(String[] args) {
        Animal leo = new Animal("Лев");
        System.out.println(leo.getName());
    }
}
