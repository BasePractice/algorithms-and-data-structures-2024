package ru.mirea.practice.s23l0908.task3;

public final class TestNameable {

    private TestNameable() {
    }

    public static void main(String[] args) {
        Nameable n1 = new Car("Vinfast");
        n1.getName();

        n1 = new Plane("Boeing 747");
        n1.getName();

        Car x1 = new Car("Tesla");
        x1.getName();
    }
}
