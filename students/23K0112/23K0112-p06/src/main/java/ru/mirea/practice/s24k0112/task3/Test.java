package ru.mirea.practice.s24k0112.task3;

public final class Test {
    private Test() {

    }

    public static void main(String[] args) {
        Cars car = new Cars("Volkswagen");
        Animals animal = new Animals("cow");
        System.out.println(car.getName() + "\n" + animal.getName());
    }
}
