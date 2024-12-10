package ru.mirea.practice.s23k0087.task1;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        Triple<String, Integer, Double> triple = new Triple<>("Объект", 123, 45.67);

        System.out.println("Первоначальные значения: " + triple);

        triple.setFirst("Измененный объект");
        triple.setSecond(234);
        triple.setThird(49.01);

        System.out.println("Измененные значения: " + triple);
    }
}

