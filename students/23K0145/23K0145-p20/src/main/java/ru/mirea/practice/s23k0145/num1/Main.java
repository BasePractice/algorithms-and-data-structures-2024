package ru.mirea.practice.s23k0145.num1;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        Triple<String, Integer, Double> triple = new Triple<>("Объект", 125, 50.87);

        System.out.println("Первоначальные значения: " + triple);

        triple.setFirst("Измененный объект");
        triple.setSecond(512);
        triple.setThird(96.23);

        System.out.println("Измененные значения: " + triple);
    }
}