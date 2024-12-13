package ru.mirea.practice.s0000001.num2;

public final class Main {

    public static class G<T, V, K> {
        T t;
        V v;
        K k;

        public G(T t, V v, K k) {
            this.t = t;
            this.v = v;
            this.k = k;
        }

        public T getT() {
            return t;
        }

        public V getV() {
            return v;
        }

        public K getK() {
            return k;
        }

        public void printClassNames() {
            System.out.println("T class: " + t.getClass().getName());
            System.out.println("V class: " + v.getClass().getName());
            System.out.println("K class: " + k.getClass().getName());
        }
    }

    private Main() {
    }

    public static void main(String[] args) {
        G<String, Integer, Double> obj = new G<>("Test", 5, 3.14);
        obj.printClassNames();
    }
}
