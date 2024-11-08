package ru.mirea.practice.s0000001.task4;

public abstract class TesterMinMax {
    public static void main(String[] args) {
        Double[] c = {-2.5, 1., 2.3, 3.4, 5.6};
        Integer[] b = {1, 2, 3, 4, -99};
        MinMax<Integer> a1 = new MinMax<>(b);
        MinMax<Double> a2 = new MinMax<>(c);
        System.out.println(a1.minElement() + "\t" + a1.maxElement());
        System.out.println(a2.minElement() + "\t" + a2.maxElement());
    }
}
