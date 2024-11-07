package ru.mirea.practice.s23k1158.t1;

public final class Onetwo {
    private Onetwo() {

    }

    public static void main(String[] args) {

        Three<String, Integer, Double> triple = new Three<>("Hello", 42, 3.14);
        triple.printClassNames();
    }

}