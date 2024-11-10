package ru.mirea.practice.u23k1158.t1;

public final class Main {
    private Main() {

    }

    public static void main(String[] args) {

        Triplet<String, Integer, Double> triple = new Triplet<>("Java", 2, 0.2);
        triple.printClassNames();
    }

}