package ru.mirea.practice.s23k0169.t3;

public final class Test {

    private Test() {

    }

    public static void main(String[] args) {
        Nameable earth = new Planet("Earth");
        Nameable tesla = new Car("Tesla");
        Nameable dog = new Animal("Dog");

        System.out.println(earth.getName());
        System.out.println(tesla.getName());
        System.out.println(dog.getName());
    }
}

