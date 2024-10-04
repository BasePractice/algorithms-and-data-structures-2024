package ru.mirea.practice.s24k0112.task11;

public final class Test {
    private Test() {

    }

    public static void main(String[] args) {
        Convertable temperature = new CelsiusConverter(1);
        System.out.println(temperature.convert());
    }
}
