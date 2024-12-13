package ru.mirea.practice.s0000001.num1;

public final class Main {

    public static class Triple<T, V, K> {
        T t;
        V v;
        K k;

        public Triple(T t, V v, K k) {
            this.t = t;
            this.v = v;
            this.k = k;
        }

        public void printValues() {
            System.out.println("Значение T: " + t);
            System.out.println("Значение V: " + v);
            System.out.println("Значение K: " + k);
        }
    }

    private Main() {
    }

    public static void main(String[] args) {
        Triple<String, Integer, Double> obj = new Triple<>("Пример", 5, 3.14);
        obj.printValues();
    }
}
