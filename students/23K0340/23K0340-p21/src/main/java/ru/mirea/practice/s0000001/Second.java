package ru.mirea.practice.s0000001;

public abstract class Second {
    public static class Mass<T> {
        private Object[] arr;
        private int size;

        public Mass(int size) {
            this.size = size;
            this.arr = new Object[size];
        }

        public void add(T t, int i) {
            arr[i] = t;
        }

        public <T> T get(int i) {
            return (T) arr[i];
        }
    }

    public static void main(String[] args) {
        Mass<String> mas = new Mass<>(5);
        Mass<Double> mass = new Mass<Double>(5);
        for (int i = 0; i < 5; i++) {
            mas.add("a", i);
            mass.add(Math.pow(2, i), i);
        }
        System.out.println((String)mas.get(3));
        System.out.println((Double)mass.get(2));
    }
}
