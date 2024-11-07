package ru.mirea.practice.s23k0130.task1;

public final class Main {
    private Main() {

    }

    public static void main(String[] args) {

        Triple<String, Integer, Double> triple = new Triple<>("Java", 2, 0.2);
        triple.printClassNames();
    }

}
