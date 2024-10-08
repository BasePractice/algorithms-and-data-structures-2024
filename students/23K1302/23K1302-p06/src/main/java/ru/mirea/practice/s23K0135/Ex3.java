package ru.mirea.practice.s23K0135;

public final class Ex3 {

    private Ex3() {
        // Пустота
    }

    public static void main(String[] args) {

        Planet earth = new Planet("Earth");
        Car car = new Car("Audi a5 sportback");
        Animal dog = new Animal("Amon Ra");

        System.out.println("Planet: " + earth.getName());
        System.out.println("Car: " + car.getName());
        System.out.println("Animal: " + dog.getName());
    }
}
